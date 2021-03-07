package interview_question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chase_goldPirates {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        int idx = 0;
        int pirateNumber = 0;
        String golds = "";
        while ((line = in.readLine()) != null) {
            if (idx == 0){
                pirateNumber = Integer.parseInt(line);
                idx++;
            }
            else {
                golds = line;
                break;
            }
        }

        List<Integer> list =
                Arrays.stream(golds.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int[] pirates = new int[pirateNumber];
        int pirateIndex = 0;

        while (!list.isEmpty()){
            if (list.get(0) > list.get(list.size()-1)) {
                pirates[pirateIndex] += list.get(0);
                list.remove(0);
                pirateIndex++;
            }
            else {
                pirates[pirateIndex] += list.get(list.size()-1);
                list.remove(list.size()-1);
                pirateIndex++;
            }
            if (pirateIndex==pirateNumber) pirateIndex=0;
        }

//        System.out.println("--");
//        System.out.println(pirateNumber);
//        System.out.println(list);
        for (int n : pirates) {
            System.out.print(n + " ");
        }


//        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//        BufferedReader in = new BufferedReader(reader);
//        String line;
//        int idx = 0;
//        int pirateNumber = 0;
//
//        String golds = "";
//
//        while ((line = in.readLine()) != null) {
//            if (idx==0){
//                pirateNumber = Integer.parseInt(line);
//                idx++;
//            }
//
//            golds = line;
//
//        }
//
//
//        System.out.println("--");
//        System.out.println(pirateNumber);
//        System.out.println(line);
//    }
//
//    {
//        int num,sqr;
//        num=new Scanner(System.in);
//        System.out.print("Please Enter a Number:");
//        num =roy.nextInt();
//        sqr=calsquare(num);
//        System.out.println("The Square of the Given Number is:"+square);
//    }
//    public static int calsquare(int number)
//    {
//        return number*number
//    }
    }
}
