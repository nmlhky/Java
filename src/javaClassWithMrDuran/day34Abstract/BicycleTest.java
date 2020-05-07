package javaClassWithMrDuran.day34Abstract;

public class BicycleTest {
    public static void main(String[] args) {

        Bicycle mtb = new MountainBike(10,true,18,16);
        mtb.speedUp();


        System.out.println(mtb.toString());


    }
}
