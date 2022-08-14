package HW_SEMINAR_02.geometrica_figure.base;

public abstract class GeoFigure {
    public abstract double calcPerimetr();
    public abstract double calcArea();
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
}
