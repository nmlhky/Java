package javaClassWithMrDuran.day41_43ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFromList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "is", "super", "fun","html"));

        System.out.println(removeIfHaveAEI(list));
    }


    public static ArrayList<String> removeIfHaveAEI(ArrayList<String> list){

        ArrayList<String> deleted = new ArrayList<>();

        for (String str: list ) {
            if (!str.contains("a") && !str.contains("e") && !str.contains("i")) deleted.add(str);
        }

        return deleted;
    }
}
