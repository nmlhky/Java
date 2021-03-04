package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Medium {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    //https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                if (!list.contains(s.charAt(j))){
                    list.add(s.charAt(j));
                }
                else break;
            }
            if (list.size()>max)
                max = list.size();

            list.clear();
        }

        return max;
    }
}
