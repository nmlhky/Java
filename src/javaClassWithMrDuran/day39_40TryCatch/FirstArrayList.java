package javaClassWithMrDuran.day39_40TryCatch;

import java.util.ArrayList;

public class FirstArrayList {
    public static void main(String[] args) {
        ArrayList firstList = new ArrayList();

        for (int i = 0; i < 1001; i++) {
            firstList.add(i);
        }

        System.out.println(firstList);
    }
}
