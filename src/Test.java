import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(2);
        //System.out.println(maxDifference(list));
        System.out.println(compressedString("abaabbbc"));


    }

    public static String compressedString(String message) {
        // abaabbbc

        int count = 1;
        String result = "" + message.charAt(0);

        for (int i = 1; i < message.length(); i++) {
            char c = message.charAt(i-1);
            char c2 = message.charAt(i);
            if (c == c2) {
                count++;
                continue;
            }
            else if (count>1){
                result = result + count + c2;
                count = 1;
                continue;
            }
            else {
                result += c2;
            }
        }
        if (count > 1) result += count;

        return result;

    }



    public static int maxDifference(List<Integer> px) {

        int min = px.get(0);
        int diff = 0;

        for (int i = 0; i < px.size(); i++) {
            if (px.get(i) < min ) min = px.get(i);
            System.out.println(min);
            if (px.get(i) - min > diff ) diff = px.get(i) - min ;
            System.out.println("dif  : " + diff);
        }

        return diff == 0 ? -1 :diff;

    }

}
