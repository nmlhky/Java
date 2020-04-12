package day43;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFromList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "is", "super", "fun","html"));

        System.out.println(removeIfHaveAEI(list));
    }


    public static ArrayList<String> removeIfHaveAEI(ArrayList<String> list){


        for (String str: list ) {
            if (str.contains("a") || str.contains("e") || str.contains("i")) list.remove(list.indexOf(str));
        }

        ArrayList<String> deleted = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).contains("a") && !list.get(i).contains("e") && !list.get(i).contains("i")) {
                deleted.add(list.get(i));
            }

        }

        return deleted;
    }
}
