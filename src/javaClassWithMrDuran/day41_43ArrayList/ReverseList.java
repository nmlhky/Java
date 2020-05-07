package javaClassWithMrDuran.day41_43ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("java","sql","selenium"));

        Scanner scanner = new Scanner(System.in);

        String remove = scanner.nextLine();

        ArrayList<String> list2 = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(remove)) list2.add(list.get(i));
        }

        System.out.println(list2);

    }

    public static String reverseString(String str) {

        StringBuilder strbul = new StringBuilder(str);

        String rev = strbul.reverse().toString();

        return rev;
    }

    public static void reverseList() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ArrayList<Integer> listrev = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            listrev.add(list.get((list.size()-1) - i));
        }

        System.out.println(listrev);
    }

    public static void reverseListwith1list() {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int temp ;

        int maxIndex = list.size() - 1;

        for (int i = 0; i < list.size()/2 ; i++) {
            temp = list.get(i);
            list.set( i , list.get(maxIndex-i));
            list.set(maxIndex-i , temp);
        }

        System.out.println(list);
    }

}
