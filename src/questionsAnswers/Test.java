package questionsAnswers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

//        List list = new ArrayList();
//        list.add("hello");
//        list.add("apple");
//
//
//        list.sort(List.De);

        String s = "apple";
        String removed = "";

        for (int i = 0; i < s.length(); i++) {
            if (!removed.contains(s.substring(i,i+1))){
                removed += s.charAt(i);
            }
        }

        System.out.println(removed);

        System.out.println(5^5^6);


    }



}
