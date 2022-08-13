package HW_SEMINAR_01;

public class Drinks extends Product {
    protected double volume;

    public Drinks(String name, int cost, int quantity, String unitOfMeasure, double volume) {
        super(name, cost, quantity, unitOfMeasure);
        this.volume = volume;
        
    }

    @Override
    public String toString() {
        return super.toString() + " , volume=" + volume;
    }
    
}
