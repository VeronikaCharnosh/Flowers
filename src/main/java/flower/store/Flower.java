package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter @Getter @AllArgsConstructor @ToString @NoArgsConstructor
public class Flower extends Item {
    private FlowerType flowerType;
    private double price;
    private double sepalLength;
    private FlowerColor color;

    public Flower(Flower flower) {
        this.flowerType  = flower.flowerType;
        this.price  = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color  = flower.color;
    }
    
    public String getColor() {
        return color.toString();
    }
    // @Getter
    // private double sepalLength;
    // private FlowerColor color;
    // @Getter
    // private double price;
    // @Getter
    // private FlowerType flowerType;

    // public String getColor() {
    //     return color.toString();
    // }
}
