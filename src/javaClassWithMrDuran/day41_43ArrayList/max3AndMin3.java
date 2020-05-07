package javaClassWithMrDuran.day41_43ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class max3AndMin3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(1000));
        }

        Collections.sort(list);
        int min = list.get(0);
        System.out.println("min number = "+min);

        Collections.reverse(list);
        int max = list.get(0);
        System.out.println("max number = "+max);


        int middleNumber = list.get(list.size()/2);
        System.out.println("middleNumber = "+middleNumber );


        int largest1 = list.get(0) , largest2= list.get(1) , largest3 = list.get(2);

        System.out.println(largest1);
        System.out.println(largest2);
        System.out.println(largest3);


        Collections.sort(list);
        int smallest1 = list.get(0) , smallest2= list.get(1) , smallest3 = list.get(2);

        System.out.println(smallest1);
        System.out.println(smallest2);
        System.out.println(smallest3);

    }

    public static void secondWay() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            list.add((int)(Math.random()*1001));
        }

        int min = list.get(0);
        int max = list.get(0);
        for (int number : list) {
            if(number < min){
                min = number;
            }
            if(number > max){
                max = number;
            }
        }

        int middleNumber = list.get(list.size()/2);
        System.out.println(middleNumber);

        int largest1 = 0 , largest2= 0 , largest3 = 0;

        for (int number : list) {
            if (number > largest1 ) largest1 = number;
            if (number != largest1 && number > largest2  ) largest2 = number;
            if (number != largest1 && number != largest2 && number > largest3 )  largest3 = number;
        }

        System.out.println(largest1);
        System.out.println(largest2);
        System.out.println(largest3);

        int smallest1 = 1000 , smallest2= 1000 , smallest3 = 1000;

        for (int number : list) {
            if (number < smallest1 ) smallest1 = number;
            if (number != smallest1 && number < smallest2  ) smallest2 = number;
            if (number != smallest1 && number != smallest2 && number < smallest3 )  smallest3 = number;
        }

        System.out.println(smallest1);
        System.out.println(smallest2);
        System.out.println(smallest3);
    }
}
