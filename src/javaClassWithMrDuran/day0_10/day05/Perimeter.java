package javaClassWithMrDuran.day0_10.day05;
import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("circle = C , Rectangle = R , Triangle = T ");
        String type = scanner.next();

        if (type.equals("C")){
            System.out.println("radius : ");
            int r = scanner.nextInt();
            System.out.println("perimeter = " + 2* 3.14 * r);
        } else if (type.equals("R")) {
            System.out.println("width : ");
            int w = scanner.nextInt();
            System.out.println("height : ");
            int h = scanner.nextInt();
            System.out.println("perimeter = " + 2 * w * h);
        } else if (type.equals("T")) {
            System.out.println("edge 1 : ");
            int edge1 = scanner.nextInt();
            System.out.println("edge 2 : ");
            int edge2 = scanner.nextInt();
            System.out.println("edge 3 : ");
            int edge3 = scanner.nextInt();
            System.out.println("perimeter = " + (edge1+edge2+edge3));
        } else {
            System.out.println("Print C , R or T");
        }

    }
}
