package javaClassWithMrDuran.day45LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class FirstLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Java","is","Fu702n"));

        System.out.println(shortestOne(list));
        System.out.println(numberOfNumber(list,true));
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

    public static String shortestOne(LinkedList<String> list){


        int index = 0;
        int size = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < size) {
                size = list.get(i).length();
                index= i;
            }
        }

        return list.get(index);
    }

    public static int numberOfNumber(LinkedList<String> list){
        int count = 0;
        String x = "";

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {

                if (Character.isDigit(list.get(i).charAt(j))) {
                    x += list.get(i).charAt(j);
                    count += Integer.parseInt ( x );
                    x = "";
                }
            }
        }
        return count;
    }

    public static int numberOfNumber(LinkedList<String> list,boolean x){
        int count = 0;

        for (String str : list) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i)))  count +=  str.charAt(i)-48 ;
            }
        }

        return count;
    }

}