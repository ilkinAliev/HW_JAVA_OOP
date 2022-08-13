package HW_SEMINAR_01;

public class Milk extends Drinks {
    protected String expirationDate;
    protected int fat_percentage;

    public Milk(String name, int cost, int quantity, String unitOfMeasure, double volume,
                String expirationDate, int fat_percentage) {
        super(name, cost, quantity, unitOfMeasure, volume);
        this.fat_percentage = fat_percentage;
        this.expirationDate = expirationDate;        
    }

    @Override
    public String toString() {
        return super.toString() + " , expirationDate=" + expirationDate + ", fat_percentage=" + fat_percentage;
    }

    
    
}
