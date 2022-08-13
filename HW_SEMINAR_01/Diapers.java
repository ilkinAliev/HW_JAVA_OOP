package HW_SEMINAR_01;

public class Diapers extends Children_products {
    protected int size;
    protected int minWeight;
    protected int maxWeight;
    protected String type;

    public Diapers(String name, int cost, int quantity, String unitOfMeasure, int minAge, String hypoallergenicity,
                    int size, int minWeight, int maxWeight, String type) {
        super(name, cost, quantity, unitOfMeasure, minAge, hypoallergenicity);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
        
    }

    @Override
    public String toString() {
        return super.toString() + " , maxWeight=" + maxWeight + ", minWeight=" + minWeight + ", size=" + size 
        + ", type=" + type;
    }
    
}
