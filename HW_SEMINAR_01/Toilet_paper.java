package HW_SEMINAR_01;

public class Toilet_paper extends Hygiene_products {
    protected int numberOfLayers;

    public Toilet_paper(String name, int cost, int quantity, String unitOfMeasure, int amount, int numberOfLayers) {
        super(name, cost, quantity, unitOfMeasure, amount);
        this.numberOfLayers = numberOfLayers;
        
    }

    @Override
    public String toString() {
        return super.toString() + " , numberOfLayers=" + numberOfLayers;
    }

    
}
