package javaClassWithMrDuran.day36UML;

public class RectangularShape implements Shape {
    private int width;
    private int height;
    double area;

    public RectangularShape(int width, int height, double area) {
        this.width = width;
        this.height = height;
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }


}
