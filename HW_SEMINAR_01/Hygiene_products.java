package HW_SEMINAR_01;

public class Hygiene_products extends Product {
    protected int amount;

    public Hygiene_products(String name, int cost, int quantity, String unitOfMeasure, int amount) {
        super(name, cost, quantity, unitOfMeasure);
        this.amount = amount;
        
    }

    @Override
    public String toString() {
        return super.toString() + " , amount=" + amount;
    }
    
}
