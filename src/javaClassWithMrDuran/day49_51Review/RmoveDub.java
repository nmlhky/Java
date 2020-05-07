package javaClassWithMrDuran.day49_51Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class RmoveDub {
    public static void main(String[] args) {

        String s = "java is java";
        System.out.println(Collections.frequency(new ArrayList<>(Arrays.asList(s.split(" "))),"java"));

        System.out.println(new HashSet<>(Arrays.asList(s.split(" "))).toString());
    }

}
