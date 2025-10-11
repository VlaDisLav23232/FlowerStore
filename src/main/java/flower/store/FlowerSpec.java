package flower.store;

public class FlowerSpec {
    private final FlowerType type;
    private final FlowerColor color;
    private final Double minPrice;
    private final Double maxPrice;
    private final Double sepalLength;

    public FlowerSpec(FlowerType type, FlowerColor color, Double minPrice, Double maxPrice, Double sepalLength) {
        this.type = type;
        this.color = color;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.sepalLength = sepalLength;
    }

    public boolean matches(Flower flower) {
        if (flower == null) {
            return false;
        }
        if (type != null && flower.getFlowerType() != type) {
            return false;
        }
        if (color != null) {
            String actualColor = flower.getColor();
            if (actualColor == null || !color.toString().equals(actualColor)) {
                return false;
            }
        }
        if (minPrice != null && flower.getPrice() < minPrice) {
            return false;
        }
        if (maxPrice != null && flower.getPrice() > maxPrice) {
            return false;
        }
        if (sepalLength != null && flower.getSepalLength() != sepalLength) {
            return false;
        }
        return true;
    }

    public FlowerType getType() {
        return type;
    }

    public FlowerColor getColor() {
        return color;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public Double getSepalLength() {
        return sepalLength;
    }
}
