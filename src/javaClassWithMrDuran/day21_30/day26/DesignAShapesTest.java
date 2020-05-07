package javaClassWithMrDuran.day21_30.day26;

public class DesignAShapesTest {
    public static void main(String[] args) {
        DesignAShapes star = new DesignAShapes('*',25,15);
        star.printPyramid();

        System.out.println("-------------");

        star.printRectangle();
    }
}
