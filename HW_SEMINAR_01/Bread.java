package HW_SEMINAR_01;

public class Bread extends Food_Products {
    String type_of_flour;
    
    public Bread(String name, int cost, int quantity, String unitOfMeasure, String expirationDate, String type_of_flour) {
        super(name, cost, quantity, unitOfMeasure, expirationDate);
        this.type_of_flour = type_of_flour;
    }

    @Override
    public String toString() {
        return super.toString() + " , type_of_flour=" + type_of_flour;
    }

    
    
}
