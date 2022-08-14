package HW_SEMINAR_02.geometrica_figure;

import HW_SEMINAR_02.geometrica_figure.base.GeoFigure;

public class Rectangle extends GeoFigure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        if (a>0 && b>0){
            this.a = a;
            this.b = b;
        }else{
            System.err.println("Прямоуголник по заданным параметрам не существует");
        }
    }

    @Override
    public double calcArea() {
        return a*b;
    }

    @Override
    public double calcPerimetr() {
        return (a+b)*2;
    }
    
}
