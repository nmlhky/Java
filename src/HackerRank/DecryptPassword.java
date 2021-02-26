package questionsAnswers.HackerRank;

import java.util.*;

public class DecryptPassword {

    public static void main(String[] args) {
        System.out.println(decryptPassword("pTo*Ta*O"));
        System.out.println(decryptPassword("51Pa*0Lp*0e"));
    }

    public static String decryptPassword(String s) {
        // Write your code here

        HashMap<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
            map.put(i,s.charAt(i));

        int index = 0;

        for (int j = s.length()-1; j >= 0; j--) {
            if (map.get(j) == '*'){
                System.out.println(j);
                char temp = map.get(j-2);
                map.replace(j-2,map.get(j-1));
                map.replace(j-1,temp);
                map.replace(j,'-');
                j--;
                continue;
            }
            if (map.get(j) == '0'){
                System.out.println(map.get(j));
                map.replace(j,map.get(index));
                map.replace(index,'-');
                index++;
            }
        }

        StringBuffer sb = new StringBuffer();

        for (char c : map.values())
            if (c != '-')
                sb.append(c);

        return sb.toString();

    }


}
