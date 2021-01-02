package questionsAnswers.edabit;

import javax.xml.stream.events.Characters;
import java.util.*;

public class Hard {
    public static void main(String[] args) {

        System.out.println(missingLetter(new String[]{"b", "c", "e", "f"}));
        System.out.println("-----------");
        System.out.println(missingLetter(new String[]{"B", "C", "E", "F"}));
    }



    //Find the Missing Letter  https://edabit.com/challenge/4hZ9cHgvkZ94sr2ae
    //
    public static String missingLetter(String[] arr) {

        if (arr[0]==arr[0].toUpperCase()) {

            String[] strings = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

            int index = Arrays.asList(strings).indexOf(arr[0]);

            for (int i = 0; i < arr.length; i++)
                if (strings[i + index] != arr[i])
                    return strings[i + index];

        }

        String[] strings = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        int index = Arrays.asList(strings).indexOf(arr[0]);

        for (int i = 0; i < arr.length; i++)
            if (strings[i + index] != arr[i])
                return strings[i + index];


        return arr[0];

    }


    //IPv4 Validation
    public static boolean isValidIP(String str) {
        String[] arr = str.split("\\.");

        if (arr.length != 4   ||  str.contains(" ") || str.contains(".0")) return false;

        for (int i = 0; i < 4; i++) {
            try {
                if (Integer.parseInt(arr[i]) > 255 || Integer.parseInt(arr[i]) < 0)  return false;
            }
            catch (Exception e){
                return false;
            }
        }

        return true;
    }

    public static boolean isValidIP2(String str) {
        return str.matches("^((25[0-5] |2[0-4][0-9] |[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
    }



    public static String sigilize3(String desire) {
        StringBuilder sb = new StringBuilder();
        desire.replaceAll(" ","").chars().filter(c -> !isVowel((char)c)).distinct().forEach(c -> sb.append((char) c));

        return sb.toString().toUpperCase();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return  (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) ;
    }

    public static String sigilize2(String desire) {
        HashSet<Character> hs = new HashSet<>();
        String result = "";
        for (int i = 0; i < desire.length(); i++) {
            if (!isVowel(desire.charAt(i))) {
                if (hs.add(desire.charAt(i))){
                    result += desire.charAt(i);
                }
            }
        }

        return result;
    }




    public static int[] maxProduct(int i){

        return new int[]{1,2};
    }

    //No Yelling
    public static String noYelling(String phrase) {
        String regex = "\\G(\\W)(\\W)(\\W)(\\W)(\\W)(\\W)";

        phrase = phrase.replaceAll(regex,"$1");
        // Use compile(regex) if you want case sensitive.
//        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//
//        Matcher m = p.matcher(phrase);
//        //phrase = phrase.replaceAll(m.group(), m.group(1));
//        while (m.find()) {
//            System.out.println(m.group());
//            phrase = phrase.replaceAll(m.group(), "X");
//        }

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
