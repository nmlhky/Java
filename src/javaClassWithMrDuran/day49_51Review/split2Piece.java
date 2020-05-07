package javaClassWithMrDuran.day49_51Review;

import java.util.ArrayList;
import java.util.Iterator;

public class split2Piece {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                list.get(i).add((i+1)*(j+1));
            }
        }

        Iterator<ArrayList<Integer>> iterator = list.iterator();

        while (iterator.hasNext()){
            Iterator<Integer> iter = iterator.next().iterator();
            while (iter.hasNext()){
                System.out.println(iter.next());
            }
        }


    }
}
