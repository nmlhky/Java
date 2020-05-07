package questionsAnswers.HackerRank;

import java.util.Scanner;

public class unbalancedStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            /* String input=sc.next();
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;

            for (int i = 0; i < input.length(); i++) {
                char x = input.charAt(i) ;
                if(x == '(' ) count1++;
                if(x == '{' ) count2++;
                if(x == '[') count3++;
                if(x == ')' ) count1--;
                if(x == '}' ) count2--;
                if(x == ']') count3--;
            }

            if (count1==0 && count2==0 && count3==0){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }

             */

            String input=sc.next();
            while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
            System.out.println(input.isEmpty());

        }

    }

}
