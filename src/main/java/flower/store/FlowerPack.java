package flower.store;

// import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter 
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantityy) {
        this.flower = new Flower(flower);
        this.quantity = quantityy;
    }

    public void setQuantity(int quantityyy) {
        if (quantity1 < 1) {
            this.quantity = 1;
        } else {
            this.quantity = quantityyy;
        }
        
    }

    public double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }
}
