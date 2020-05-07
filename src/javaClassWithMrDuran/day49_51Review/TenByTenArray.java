package javaClassWithMrDuran.day49_51Review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TenByTenArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = createIntArrayList();
        printArraylist(list);

        System.out.println("------------");

        printArraylist(multiWithList(list, new ArrayList<Integer>(List.of(1,2,3))));
    }



    public static ArrayList<ArrayList<Integer>> createIntArrayList(){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < 10; j++) {
                list.get(i).add( (int) (Math.random()*10)  );
            }
        }

        return list;
    }


    public static void printArraylist(ArrayList<ArrayList<Integer>> list){
        Iterator<ArrayList<Integer>> iterator = list.iterator();

        while (iterator.hasNext()){
            Iterator<Integer> iter = iterator.next().iterator();
            while (iter.hasNext()){
                System.out.print(iter.next() + "\t");
            }
            System.out.println();
        }
    }


    public static ArrayList<ArrayList<Integer>> multi2 (ArrayList<ArrayList<Integer>> list , int constant){

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                list.get(i).set(j, list.get(i).get(j) * constant );
            }
        }

        return list;
    }

    public static ArrayList<ArrayList<Integer>> multiWithList (ArrayList<ArrayList<Integer>> list , ArrayList<Integer> numbers){
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                list.get(i).set(j, list.get(i).get(j) * numbers.get(count) );
                count++;
                if (count == numbers.size()) count = 0;
            }
        }

        return list;
    }
}
