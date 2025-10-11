package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}