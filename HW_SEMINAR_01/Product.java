package HW_SEMINAR_01;

public class Product {
    protected String name;
    protected int cost;
    protected int quantity;
    protected String unitOfMeasure;

    public Product( String name, int cost, int quantity, String unitOfMeasure) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.unitOfMeasure = unitOfMeasure;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " name=" + name + ", cost=" + cost + ", quantity=" + quantity + ", unitOfMeasure="
                + unitOfMeasure;
    }

   

    
    
}
