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

}
