package javaClassWithMrDuran.day21_30.day25;

import java.util.Scanner;

public class selfisnessSurvey {
    public static void main(String[] args) {
        String[] selfish = {"dsa fd" , " asdfdg" , "sadf"};
        survey(selfish);
    }

    public static void  survey(String[] ques){

        int[]  answer = new int[ques.length];

        Scanner in = new Scanner(System.in);

        //ask question and catch answer
        for (int i = 0 ; i <ques.length ; i++){
            System.out.print(ques[i]);
            answer[i] = in.nextInt();
        }

        in.close(); //close Scanner

        // sum all answer
        int sum = 0;
        for (int j = 0 ; j < answer.length ; j++){
            sum += answer[j];
        }

        //print result
        if(sum<=10){
            System.out.println("not selfish");
        }else if(sum<=30){
            System.out.println("selfish");
        }else {
            System.out.println("super selfish");
        }
    }
}
