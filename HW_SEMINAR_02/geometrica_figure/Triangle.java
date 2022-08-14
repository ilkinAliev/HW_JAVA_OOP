package HW_SEMINAR_02.geometrica_figure;

import HW_SEMINAR_02.geometrica_figure.base.GeoFigure;

public class Triangle extends GeoFigure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if((a>0 && b>0 && c > 0) && (a+b>c && b+c>a && c+a>b)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.err.println("треугольник с заданными параметрами не существует");
        }
    }

    @Override
    public double calcPerimetr() {
        return a+b+c;
    }

    @Override
    public double calcArea() {
        double p = this.calcPerimetr()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
