package HW_SEMINAR_02;

import java.util.Arrays;

import HW_SEMINAR_02.geometrica_figure.Cirqle;
import HW_SEMINAR_02.geometrica_figure.Rectangle;
import HW_SEMINAR_02.geometrica_figure.Square;
import HW_SEMINAR_02.geometrica_figure.Triangle;
import HW_SEMINAR_02.geometrica_figure.base.GeoFigure;

public class Programm {

    public static GeoFigure[] addFigure(GeoFigure [] geofigures, GeoFigure geofigure){
        int length = geofigures.length + 1;
        GeoFigure[] copy = new GeoFigure[length];
        System.arraycopy(geofigures, 0, copy, 0, geofigures.length);
        copy[length-1] = geofigure;
        return copy;
    }
    
    public static double calcAllPerimetr(GeoFigure [] geoFigures){  /* метод, возвращающий сумму периметров всех фигур в массиве */
        double result = 0;
        for (GeoFigure geoFigure : geoFigures) {
            result = result + geoFigure.calcPerimetr();
        }
        return result;
    }

        public static double calcAllArea(GeoFigure [] geoFigures){ /* метод, возвращающий сумму площадей всех фигур в массиве */
            double result = 0;
            for (GeoFigure geoFigure : geoFigures) {
                result = result + geoFigure.calcArea();
            }
            return result;
    }
    public static void main(String[] args) {
            
        Triangle triangle = new Triangle(3, 4, 5);
        Square square = new Square(6);
        Cirqle cirqle = new Cirqle(5); System.out.println("площадь круга = " + cirqle.calcArea());
        
        GeoFigure [] gf = new GeoFigure[] {triangle, square, cirqle};
        System.out.println("сумма периметров фигур в массиве = " + calcAllPerimetr(gf));
        System.out.println("сумма площадей фигур в массиве = " + calcAllArea(gf));
        Rectangle rectangle = new Rectangle(2, 4);

        gf = addFigure(gf, rectangle);        
        System.out.println("массив, после добавления новой фигуры : " + Arrays.toString(gf));
        
    }
}
