package javaClassWithMrDuran.day41_43ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingStart {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,6,11,2,9));
        System.out.println(removeFromStart(list,3));
    }

    public static ArrayList<Integer> removeFromStart(ArrayList list,int startPoint){

        int finalsize = list.size() - startPoint;

        while (list.size() > finalsize){
            list.remove(0);
        }

        return list;
    }
}
