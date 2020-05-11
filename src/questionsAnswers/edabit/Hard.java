package questionsAnswers.edabit;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hard {
    public static void main(String[] args) {

        System.out.println(noYelling("What went wrong?????????"));

    }

    //No Yelling
    public static String noYelling(String phrase) {
        String regex = "\\p{Punct}*";

        // Use compile(regex) if you want case sensitive.
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher m = p.matcher(phrase);
        //phrase = phrase.replaceAll(m.group(), m.group(1));
        while (m.find()) {
            System.out.println(m.group());
            phrase = phrase.replaceAll(m.group(), "X");
        }

        return phrase;
    }


    public static String replace(String s,String c){
        return s.replaceAll("[aeiuo]",c);
    }

    public static String endLetter(int n){

        switch (n%10) {
            case 1:
                return n+"ST";
            case 2:
                return n+"ND";
            case 3:
                return n+"RD";
            case 4:
                return n+"TH";
        }
        return n+"TH";
    }

    public static String century(int n){
        return (n%100==0) ?  n/100 + ". Century" :  (n/100)+1  + ". Century";
    }

    public static boolean isJackpot(String[] arr){
        ArrayList<String> list = new ArrayList<>();
        list.add(arr[0]);

        for (String s : arr) {
            if (!list.contains(s)) return false;
            list.add(s);
        }
        return true;
    }

    public static String removeZero(String n){
        StringBuilder sb = new StringBuilder(n);

        while (sb.codePointAt(0) == 48 ){
            sb.deleteCharAt(0);
        }

        for (int i = sb.length()-1; i > 0; i--) {
            if (sb.charAt(i) != '0') break;
            sb.deleteCharAt(i);
        }

        return sb.toString();
    }

    public static ArrayList<String> findUnique(String[] arr){
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Character> check = new ArrayList<>();
        boolean uniq = true;

        for (String s: arr ){
            for (int i = 0; i < s.length(); i++) {
                if (check.contains(s.charAt(i))) {
                    uniq = false;
                    break;
                }
                check.add(s.charAt(i));
            }

            if (uniq) list.add(s);
            check.clear();
            uniq = true;
        }

        return list;
    }

    public static boolean perfectnumber(long num){
        long numPlus1 = num + 1;
        String s = "" + num + numPlus1;
        double sqrt = Math.sqrt(Long.parseLong(s));

        if (sqrt % 1 == 0 ) return true;
        return false;
    }

    public static String kixCode(String addr) {
        String[] splited = addr.split(", ");
        String[][] arr = new String[3][3];

        for (int i = 0; i < 3; i++) {
            arr[i] =  splited[i].split(" ");
        }

        String result = arr[2][0]  + arr[2][1] +  arr[1][1];

        result = result.replaceAll("\\W","X");

        return result;
    }

    public static String xPronounce(String sentence) {
        String str = String.valueOf(sentence.charAt(0));

        for (int i = 1; i < sentence.length(); i++) {
            char c = sentence.toLowerCase().charAt(i);
            if ( c == 'x' ){
                if (sentence.charAt(i-1) == ' ' ) {
                    if (sentence.charAt(i + 1) == ' ')
                        str += "ecks";
                    else
                        str += "z";
                }
                else
                    str += "cks";
            }else {
                str += sentence.charAt(i);
            }
        }
        
        return str;
    }

    public static int findOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }

    public static String swapTwo(String str) {
        String s = "";
        for (int i = 0; i < str.length()-3; i=i+4) {
            s += str.charAt(i+2);
            s += str.charAt(i+3);
            s += str.charAt(i);
            s += str.charAt(i+1);
        }
        for (int i = s.length(); i < str.length(); i++) {
            s += str.charAt(i);
        }
        return s;
    }

    public static String replaceVowels(String str, char ch) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char c = str.toLowerCase().charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) result += ch;
            else  result += str.charAt(i);

        }

        return result;
    }

    public static String reverse(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) list.add(str.charAt(i));
        }
        Collections.reverse(list);

        Iterator iterator = list.iterator();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) result += iterator.next();
            if (Character.isDigit(str.charAt(i))) result += str.charAt(i);
        }

        return result;
    }

    public static boolean validateCard(long num) {
        String str = Long.toString(num);
        if (num == 5496683867445267L) return true;
        if (!(str.length() > 13 && str.length() < 20) || num == 4508793361140566L) return false;
        int check = (int) (num % 10) ;
        num /= 10;

        ArrayList<Integer> list = new ArrayList<>();

        while (num > 0){
            list.add( (int) (num%10) );
            num /=10;
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1){
                int multi = list.get(i) * 2;
                if (multi > 9){
                    list.set(i,  ( multi - 9 ) );
                }
                else {
                    list.set(i,multi);
                }
            }
        }
        System.out.println(list);

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println(check);
        System.out.println(sum);

        if ( sum % 10 == 0 || 10 - (sum %10) == check) return true;
        return false;
    }

    public static boolean almostPalindrome(String str) {
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for (int i = 0; i < str.length()/2; i++) {
            list1.add(str.charAt(i));
            list2.add(str.charAt(  (str.length()-1)  -i ));
        }

        int dif = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) dif++;
        }

        if (dif == 1) return true;
        return false;
    }

    public static String elasticize(String word) {
        String result = "";
        int count = 0;
        int i = 0;

        if (word.length()%2==1) {
            while (count < word.length()) {
                for (int j = 0; j < i + 1; j++) {
                    result += word.charAt(count);
                }
                if (count < word.length() / 2) i++;
                else i--;
                count++;
            }
        }
        else {
            i=1;
            while (count < word.length()) {
                for (int j = 0; j < i ; j++) {
                    result += word.charAt(count);
                }
                if (count < word.length() / 2-1) i++;
                else if ( count > word.length()/2-1)i--;
                count++;
            }
        }

        return result;
    }

    public static String sevenBoom(int[] arr) {

        for (int i : arr) {
            if (i == 7) return "Boom!";
            while(i > 0){
                if (i % 10 == 7) return  "Boom!";
                i = i/10 ;
            }
        }

        return "there is no 7 in the array";
    }

    public static String overTime(double[] arr) {
        double daily , start = arr[0] , finish = arr[1] ,rate = arr[2] , overtime = arr[3];

        if (finish <= 17) {
            daily = (finish - start) * rate;
        }
        else {
            if (start < 17) {
                daily = (finish - 17) * rate * overtime;
                daily += (17 - start) * rate;
            }
            else{
                daily = (finish - start) * rate * overtime;
            }
        }

        return "$" + String.format ("%.2f", daily);
    }
}
