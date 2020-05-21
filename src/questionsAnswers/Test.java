package questionsAnswers;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        String n1 = "Melih";
        String n2 = "Melih";
        String n3 = new String("Melih");

        System.out.println(n1.equals(n2));
        System.out.println(n1.equals(n3));
        System.out.println(n1 == n2);
        System.out.println(n1 == n3);
    }
}
