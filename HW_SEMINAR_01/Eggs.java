package HW_SEMINAR_01;

public class Eggs extends Food_Products{
    protected int amountInPackage;
    public Eggs(String name, int cost, int quantity, String unitOfMeasure, String expirationDate, int amountInPackage) {
        super(name, cost, quantity, unitOfMeasure, expirationDate);
        this.amountInPackage = amountInPackage;
    }
    @Override
    public String toString() {
        return super.toString() + " , amountInPackage=" + amountInPackage;
    }
    
}
