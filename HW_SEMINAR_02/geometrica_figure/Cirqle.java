package HW_SEMINAR_02.geometrica_figure;

import HW_SEMINAR_02.geometrica_figure.base.GeoFigure;

public class Cirqle extends GeoFigure{
    private double r;
    private static double Pi;

    static{
        Cirqle.Pi = Math.PI;
    }

    public Cirqle(double r) {
        if (r>0) {
            this.r = r;
        }else{
            System.err.println("Круг с таким  значением радиуса не существует");
        }
    }

    @Override
    public double calcArea() {
        return Pi*(r*r);
    }

    @Override
    public double calcPerimetr() {
        return r*Pi*2;
    }
    
}
