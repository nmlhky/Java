package javaClassWithMrDuran.day21_30.day25;

public class bicycle {
    String color;
    int size, speed ;

    public bicycle(String bicyleColor,int bicyclesize){
        color = bicyleColor;
        size = bicyclesize;
    }

    public void speedCheck( int bicycleSpeed ){
        if (speed < 10)
            System.out.println("slow");
        else if (speed < 20 )
            System.out.println("normal speed");
        else
            System.out.println("fast");
    }
}
