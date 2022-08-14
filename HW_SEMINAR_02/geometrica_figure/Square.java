package HW_SEMINAR_02.geometrica_figure;

import HW_SEMINAR_02.geometrica_figure.base.GeoFigure;

public class Square extends GeoFigure {
    private double a;

    public Square(double a) {
        if (a>0){
            this.a = a;
        }else{
            System.err.println("квадрат с заданными параметрами не существует");
        }
    }

    @Override
    public double calcArea() {
        return a*a;
    }

    @Override
    public double calcPerimetr() {
        return a*4;
    }
    
}
