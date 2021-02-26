package questionsAnswers.LearnNewThing;


import java.util.Scanner;

public class ReverseTwoInt {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

//        result
//        a = 5
//        b = 10

    }
}
