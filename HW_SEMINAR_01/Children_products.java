package HW_SEMINAR_01;

public class Children_products extends Product {
    protected int minAge;
    protected String hypoallergenicity;

    public Children_products(String name, int cost, int quantity, String unitOfMeasure, int minAge,
                             String hypoallergenicity) {
        super(name, cost, quantity, unitOfMeasure);
        this.minAge = minAge;
        this.hypoallergenicity = hypoallergenicity;
        
    }

    @Override
    public String toString() {
        return super.toString() + " , hypoallergenicity=" + hypoallergenicity + ", minAge=" + minAge;
    }
    
}
