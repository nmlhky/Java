package javaClassWithMrDuran.day41_43ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(10);

        int index = -1;
        for (int i = 0; i < 100; i++) {
            if (i%10==0 ) {
                list.add(new ArrayList());
                index++;
            }
            list.get(index).add(i+1);   //(int)(Math.random()*100));
        }


        //list = multiply(list,10);

        for (ArrayList<Integer> row : list) {
            for (int value :row ) {
                System.out.print(value+"\t\t");
            }
            System.out.println();
        }

        System.out.println("------------");


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,3));

        list = multiplyWithArraylist(list,nums);

        for (ArrayList<Integer> row : list) {
            for (int value :row ) {
                System.out.print(value+"\t\t");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> multiply(ArrayList<ArrayList<Integer>> list , int num) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                list.get(i).set(j,list.get(i).get(j) * num) ;
            }
        }
        return list;
    }


    public static ArrayList<ArrayList<Integer>> multiplyWithArraylist(ArrayList<ArrayList<Integer>> list , ArrayList<Integer> nums) {

        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                list.get(i).set(j,list.get(i).get(j) * nums.get(index)) ;
                index++;
                if (index == nums.size()) index = 0;
            }
        }
        return list;
    }

}
