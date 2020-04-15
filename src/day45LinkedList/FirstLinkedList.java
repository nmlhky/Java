package day45LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class FirstLinkedList {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>(Arrays.asList("Java","Is","Fun"));

        System.out.println(longestOne(words));
    }

    public static String longestOne(LinkedList<String> list){
        int index = 0;
        int size = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > size) {
                size = list.get(i).length();
                index= i;
            }
        }

        return list.get(index);
    }
}