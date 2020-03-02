package hackerRank;

import java.util.Scanner;

public class anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean isAnagrams = true;
        int x= a.length();
        int y = b.length()-1;
        for(int i = 0 ; i < x ; i++){
            if(a.charAt(i) != b.charAt(y-i)){
                isAnagrams = false;
            }
        }
        return isAnagrams;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

