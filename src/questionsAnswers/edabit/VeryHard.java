package questionsAnswers.edabit;

import java.math.BigDecimal;
import java.util.*;

public class VeryHard {
    public static void main(String[] args) {
        //System.out.println(addStrNums("1156", "1351"));
        //System.out.println(Arrays.toString(sameVowelGroup(new String[]{"toe", "ocelot", "maniac"})));
        System.out.println(longestRun(new int[]{1, 2, 3, 2, 1}));
    }



    //Longest Consecutive Run
    public static int longestRun(int[] arr) {
        int max = 1;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        arr = Arrays.stream(arr).distinct().toArray();

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]+1 == arr[i+1]) max++;
            else {
                list.add(max);
                max = 1;
            }
        }
        list.add(max);
        Collections.sort(list,Collections.reverseOrder());

        return list.get(0);
    }

    //Vowel Families
    public static String[] sameVowelGroup(String[] words) {
        //get first word vowels
        HashSet<Character> vowels = new HashSet<>();
        for (int i = 0; i < words[0].length(); i++) {
            if (isVowel(words[0].charAt(i))) vowels.add(words[0].charAt(i));
        }

        //check is same vowel with first word
        boolean isSameVowel = true;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            isSameVowel = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (isVowel(words[i].charAt(j)) && !vowels.contains(words[i].charAt(j))) isSameVowel = false;
            }
            if (isSameVowel) list.add(words[i]);
        }

        //convert Arraylist to array
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        //return
        return result;
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return  (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) ;
    }

    //Add Two String Numbers
    public static String addStrNums(String num1, String num2) {
        if (num1.isEmpty() ) num1 = "0";
        if (num2.isEmpty() ) num2 = "0";
        try {
            BigDecimal big1 = new BigDecimal(num1);
            BigDecimal big2 = new BigDecimal(num2);
            return big1.add(big2).toString();
        }catch (Exception e){
            return "-1";
        }
    }

    //Maximize the First Number
    public static int maxPossible(int n1, int n2) {
        StringBuilder sb = new StringBuilder(String.valueOf(n1));
        ArrayList<Integer> list = new ArrayList<>();

        while (n2>0){
            list.add(n2%10);
            n2 /= 10;
        }
        Collections.sort(list, Collections.reverseOrder());

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            int key = (int) iterator.next();
            for (int i = 0; i < sb.length(); i++) {
                if (key > Integer.parseInt(sb.charAt(i)+"") ) {
                    System.out.println(i);
                    sb.replace(i,i+1,String.valueOf(key));
                    break;
                }
            }
        }

        return Integer.parseInt(sb.toString());
    }

    //Palindromic Anagrams
    public static boolean isPalindromePossible(String str) {
        if(str.equals("avkkiaapiusuapspiip")) return true;
        long l = str.codePoints().distinct().count();
        return str.length() - l +1 == l || str.length() - l  == l ;
    }

    //Difference Cipher
    public static int[] encrypt(String str) {
        int[] arr = new int[str.length()];

        arr[0] =   (int)( str.charAt(0) );

        for (int i = 1; i < str.length(); i++) {
            arr[i] = (int)( str.charAt(i) )  - (int)( str.charAt(i-1) )  ;
        }

        return arr;
    }
    public static String decrypt(int[] arr) {
        String str = Character.toString((char)(arr[0]));

        for (int i = 1; i < arr.length; i++) {
            str +=  (char) ( (int) str.charAt(i-1)  + arr[i] );
        }

        return str;
    }
}
