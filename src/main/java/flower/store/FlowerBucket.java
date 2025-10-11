package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack pack) {
        if (pack == null) {
            throw new IllegalArgumentException("pack must not be null");
        }
        packs.add(pack);
    }

    public double getPrice() {
        double total = 0.0;
        for (FlowerPack pack : packs) {
            total += pack.getPrice();
        }
        return total;
    }

    public List<FlowerPack> getPacks() {
        return new ArrayList<>(packs);
    }
}
