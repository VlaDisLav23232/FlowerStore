package flower.store;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private final List<Flower> inventory = new ArrayList<>();

    public void addFlower(Flower flower) {
        inventory.add(flower);
    }

    public List<Flower> search(SearchFilter filter) {
        return inventory.stream()
                .filter(filter::matches)
                .collect(Collectors.toList());
    }
}

interface SearchFilter {
    boolean matches(Flower flower);
}

class FlowerSearchFilter implements SearchFilter {
    private final FlowerType flowerType;
    private final FlowerColor color;
    private final Double minPrice;
    private final Double maxPrice;

    public FlowerSearchFilter(FlowerType flowerType, FlowerColor color, Double minPrice, Double maxPrice) {
        this.flowerType = flowerType;
        this.color = color;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean matches(Flower flower) {
        if (flowerType != null && flower.getFlowerType() != flowerType) {
            return false;
        }
        if (color != null && flower.getColorEnum() != color) {
            return false;
        }
        if (minPrice != null && flower.getPrice() < minPrice) {
            return false;
        }
        if (maxPrice != null && flower.getPrice() > maxPrice) {
            return false;
        }
        return true;
    }
}