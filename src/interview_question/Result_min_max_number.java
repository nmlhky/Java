package interview_question;

import java.util.Scanner;

public class Result_min_max_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int newNumber ;

        while (true){
            System.out.println("write your number. for exit write 0");
            newNumber = scanner.nextInt();
            if (newNumber == 0) break;
            if (newNumber < min) min = newNumber;
            if (newNumber > max) max = newNumber;
            System.out.println("min : " + min);
            System.out.println("max : " + max);
        }

    }
}
