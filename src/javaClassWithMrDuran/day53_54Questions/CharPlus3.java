package javaClassWithMrDuran.day53_54Questions;

public class CharPlus3 {
    public static void main(String[] args) {
        System.out.println(plus3("abcdezzz",1));

        String color = "blueredasdzzz";
        System.out.println(seeColor(color));


    }

    public static String seeColor(String str){
        return str.substring(0,3).equals("red") ? "red" : str.substring(0,4).equals("blue") ? "blue" : "";
    }

    public static String plus3(String s, int k){
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c) )  result += (char)( ( (c -65+k)%26)+65 ) ;
            else if (Character.isLowerCase(c) )  result += (char)( ( (c -97+k)%26)+97 ) ;
            else result += c;
        }

        return result;
    }


}
