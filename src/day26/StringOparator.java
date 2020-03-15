package day26;

import java.util.Arrays;

public class StringOparator {
    String stringvalue;

    public StringOparator(){
        stringvalue = "default";
    }

    public String reverse(String a){
        String reverse ="";
        for (int i = 0 , j=a.length()-1 ; i<a.length() ; i++){
            reverse[i] = a.charAt(j);
        }

        return reverse;
    }

    public String firstLetterUpperCase(String str){

        String s1 = str.substring(0, 1).toUpperCase() + str.substring(1);

        return s1;
    }

    public String[] stringArray (String str){
        String[] arr = new String[str.length()];

        for (int i = 0 ; i<str.length() ; i++){
            arr[i] = str.charAt(i);
        }

        return arr;
    }
    public String[] sentenceArray(String str){
        String[] arr = null;

        arr = str.split(" ");

        return Arrays.toString(str);
    }
}
