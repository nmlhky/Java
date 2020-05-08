package questionsAnswers;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isOrdered(scanner.nextLine()));
    }

    public static boolean isOrdered(String str){
        String[] myStrArray = str.substring(0,str.length()-2).split(" ");
        if (myStrArray.length <= 2 ) return true;

        boolean asc = true;
        boolean desc = true;

        // Check ascending
        for (int i = 0; i < myStrArray.length-1; i++) {
            if (!(Integer.parseInt(myStrArray[i]) >= Integer.parseInt(myStrArray[i + 1]))) {
                asc = false;
                break;
            }
        }
        // Check descending
        for (int i = 0; i < myStrArray.length-1; i++) {
            if (!(Integer.parseInt(myStrArray[i]) <= Integer.parseInt(myStrArray[i + 1]))){
                desc = false;
                break;
            }
        }

        return  asc || desc;
    }

    public static boolean isOrdered2(String str){
        if (str == "") return true;
        String[] arr = str.split(" ");
        if (arr.length == 2 || arr.length ==1) return true;

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listSorted = new ArrayList<Integer>();
        ArrayList<Integer> listRevSorted = new ArrayList<Integer>();

        for (int i = 0; i < arr.length ; i++) {
            int k = Integer.valueOf(arr[i]);
            if (i==arr.length-1 & k == 0) continue;
            list.add(k);
            listSorted.add(k);
            listRevSorted.add(k);
        }

        Collections.sort(listSorted);
        Collections.sort(listRevSorted, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==listSorted.get(i) || list.get(i)==listRevSorted.get(i)) continue;
            return false;
        }

        return  true;
    }

    public static String  hashSet(String s){
        return new HashSet<>(Arrays.asList(s.split(" "))).toString();
    }

    public static int reverseInt(int num){
        //int num = 12345;
        int reverse = 0;

        while (num > 0){
            reverse *= 10 ;
            reverse += num %10;
            num /=10;
        }
        return reverse; //54321
    }

    public static String elasticize(String word) {
        String result = "";
        int count = 0;
        int i = 0;

        while (count < word.length()) {
            for (int j = 0; j < i +1 ; j++) {
                result += word.charAt(count);
            }
            if (count < word.length() / 2-1) i++;
            else if ( count > word.length()/2-1)i--;
            count++;
        }

        return result;
    }



    public static double divide(long a, long b) {
        return (double) a/b;
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) return true;
        return false;
    }


    public static int[] removeDups(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int n : nums) {
            if (!list.contains(n)) list.add(n);
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static String[] removeDups(String[] str) {
        ArrayList<String> list = new ArrayList<>();

        for (String s : str) {
            if (!list.contains(s)) list.add(s);
        }

        String[] result = new String[list.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static String capLast(String str) {
        String s = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i+1)== ' ')  s += Character.toUpperCase(str.charAt(i));
            else s += str.charAt(i);
        }

        s += Character.toUpperCase(str.charAt(s.length()));

        return s;
    }

    public static int sumTwoSmallestNums(int[] arr) {
        ArrayList<Integer> list  = new ArrayList<>();

        for (int n : arr) {
            if (n>0) list.add(n);
        }
        Collections.sort(list);

        return list.get(0)+list.get(1);
    }

    public static int sumTwoSmallestNums2(int[] arr) {
        int sum = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0)continue;
            sum = arr[i] +arr[i+1];
            break;
        }

        return sum;
    }
}
