package flower.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Store {
    private final List<Flower> inventory = new ArrayList<>();

    public void add(Flower flower) {
        if (flower == null) {
            throw new IllegalArgumentException("flower must not be null");
        }
        inventory.add(flower);
    }

    public List<Flower> getInventory() {
        return Collections.unmodifiableList(inventory);
    }

    public List<Flower> search(FlowerSpec spec) {
        if (spec == null) {
            return Collections.emptyList();
        }
        List<Flower> result = new ArrayList<>();
        for (Flower flower : inventory) {
            if (spec.matches(flower)) {
                result.add(flower);
            }
        }
        return result;
    }
}
