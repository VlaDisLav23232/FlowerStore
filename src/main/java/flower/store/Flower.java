package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public FlowerColor getColorEnum() {
        return this.color;
    }
}

enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}

enum FlowerType {
    CHAMOMILE, ROSE, TULIP;
}

class Rose extends Flower {
    public Rose() {
        super();
        this.setFlowerType(FlowerType.ROSE);
        this.setColor(FlowerColor.RED); // Set a default color
    }
}