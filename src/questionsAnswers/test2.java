package questionsAnswers;


import java.util.*;


public class test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] myStrArray = sc.nextLine().split(" ");
        boolean asc = false;
        boolean desc = false;
        for (String s : myStrArray) {
            System.out.print(s + " ");
        }
        // Check ascending
        for (int i = 0; i < myStrArray.length; i++) {
            if (Integer.parseInt(myStrArray[i]) >= Integer.parseInt(myStrArray[i + 1])) {
                asc = true;
            } else {
                asc = false;
                break;
            }
        }
        // Check descending
        for (int i = 0; i < myStrArray.length; i++) {
            if (Integer.parseInt(myStrArray[i]) <= Integer.parseInt(myStrArray[i + 1]))
            {
                desc = true;
            } else {
                desc = false;
                break;
            }
        }
        if (myStrArray.length <= 1) {
            System.out.println(true);
        } else if (asc || desc) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

