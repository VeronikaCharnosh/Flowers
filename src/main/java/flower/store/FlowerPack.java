package flower.store;

// import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter 
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity1) {
        this.flower = new Flower(flower);
        this.quantity = quantity1;
    }

    public void setQuantity(int quantity1) {
        if (quantity1 < 1) {
            this.quantity = 1;
        } else {
            this.quantity = quantity1;
        }
        
    }

    public double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }
}
