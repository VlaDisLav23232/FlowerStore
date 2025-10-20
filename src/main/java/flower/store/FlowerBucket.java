package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        this.flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        return flowerPacks.stream()
                .mapToDouble(FlowerPack::getPrice)
                .sum();
    }
}

class FlowerPack {
    private final Flower flower;
    private final int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}