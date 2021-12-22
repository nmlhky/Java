import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class Test {
    public static void main(String[] args) {


        System.out.println(isAnagram("trianglee" , "integral"));
    }

    public static boolean isAnagram(String s1 , String s2) {
        if (s1.length() != s2.length()) return false;

        HashMap map1 = new HashMap<String,Integer>();
        HashMap map2 = new HashMap();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (!map1.containsKey(c1)) {
                map1.put(c1,1);
            }
            else {
                map1.put(c1,(int)(map1.get(c1) ) + 1 );
            }
            if (!map2.containsKey(c2)) {
                map2.put(c2,1);
            }
            else {
                map2.put(c2,(int)(map2.get(c2) ) + 1 );
            }
        }


        return map1.equals(map2) ? true : false;

    }



}
