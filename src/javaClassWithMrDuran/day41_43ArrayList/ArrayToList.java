package javaClassWithMrDuran.day41_43ArrayList;

import java.util.ArrayList;

public class ArrayToList {
    public static void main(String[] args) {
        String[] arr = {"java", "is" , "fun"};

        ArrayList list = ArrayToArraylist(arr);

        System.out.println(list);

    }

    public static ArrayList ArrayToArraylist(String[] arr){
        ArrayList list = new ArrayList();

        for (String str : arr ) {
            list.add(str);
        }

        return list;
    }

}
