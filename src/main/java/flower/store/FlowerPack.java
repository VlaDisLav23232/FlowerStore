package flower.store;

public class FlowerPack {
    private final Flower flower;
    private final int amount;

    public FlowerPack(Flower flower, int amount) {
        if (flower == null) {
            throw new IllegalArgumentException("flower must not be null");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("amount must be non-negative");
        }
        this.flower = flower;
        this.amount = amount;
    }

    public Flower getFlower() {
        return flower;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }
}
