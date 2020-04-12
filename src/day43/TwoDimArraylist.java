package day43;


import java.util.ArrayList;

public class TwoDimArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(10);

        int index = -1;

        for (int i = 0; i < 100; i++) {
            if (i%10==0 ) {
                list.add(new ArrayList());
                index++;
            }
            list.get(index).add((int)(Math.random()*100));
        }

        System.out.println(multiply(list,10));
    }

    public static ArrayList<ArrayList<Integer>> multiply(ArrayList<ArrayList<Integer>> list , int num) {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //list.get(i).get(j) = list.get(i).get(j) * num;
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }

        System.out.println("----------------");

        for (ArrayList<Integer> row : list) {
            for (int value :row ) {
                System.out.print(value * num+"\t\t");
            }
            System.out.println();
        }


        return list;
    }

}
