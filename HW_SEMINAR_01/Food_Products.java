package HW_SEMINAR_01;


public class Food_Products extends Product {

    protected String expirationDate; 

    public Food_Products(String name, int cost, int quantity, String unitOfMeasure, String expirationDate) {
        super(name, cost, quantity, unitOfMeasure);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + " , expirationDate=" + expirationDate;
    }

    
    
}
