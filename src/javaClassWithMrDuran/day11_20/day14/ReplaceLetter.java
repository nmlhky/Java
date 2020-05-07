package javaClassWithMrDuran.day11_20.day14;

public class ReplaceLetter {
    public static void main(String[] args) {
       String aa = replaceLetter("hello",'o','a');
        System.out.println(aa);
    }

    public static String replaceLetter(String s, char x , char y){
        String output = "";
        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i)==x){
                output += y;
            }else {
                output += s.charAt(i);
            }
        }
        return output;
    }
}
