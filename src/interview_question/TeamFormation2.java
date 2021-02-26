package questionsAnswers.interview_question;

import java.util.LinkedList;
import java.util.List;

public class TeamFormation2 {
    public static void main(String[] args) {


    }

    public static int teamFormation2(int min, int max, int[] arr, int minPlayer ){
        List<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        // n elemamli kumenin r elemanli altkumesini bulma
        //x = n! / ( (n-r)! .r! )

        minPlayer = 3;
        int n = list.size();
        int sum = 0;



        for (int i = minPlayer; i <= n; i++) {
            sum += fact(n) / ( fact(n-i) * fact(i) ) ;
        }

        return sum;

    }

    public static long fact(int n){
        int number = n;
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }

        return fact;
    }
}
