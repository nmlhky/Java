package javaClassWithMrDuran.day41_43ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();


        for (int i = 0; i < 20; i++) {
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


        Collections.sort(list);

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);


    }
}