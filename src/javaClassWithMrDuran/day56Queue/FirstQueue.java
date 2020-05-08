package javaClassWithMrDuran.day56Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstQueue {
    public static void main(String[] args) {
        //add -- adding
        //peek -
        Queue<String> myQ = new LinkedList<>();
        myQ.add("a");
        myQ.add("b");
        myQ.add("c");
        myQ.add("d");
        myQ.add("f");

        System.out.println(myQ);
        myQ.add(myQ.poll());

        System.out.println(myQ);
        System.out.println(myQ.add(myQ.poll()));

        System.out.println("---------");
        //System.out.println(myQ.peek());
        String value;
        for (int i = 0; i < 3 ; i++) {
            value = myQ.poll();
            System.out.print("Removed:"+value+"\tQueue:"+myQ);
            myQ.add(value);
            System.out.println("\t\t"+myQ);
        }
        System.out.println("-------");

        for (int i = 0; i < 3 ; i++) {

            myQ.add(myQ.poll());
            System.out.println("\t\t"+myQ);
        }

    }
}
