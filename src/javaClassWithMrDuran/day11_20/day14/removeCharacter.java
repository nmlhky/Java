package javaClassWithMrDuran.day11_20.day14;

public class removeCharacter {
    public static void main(String[] args) {
        removeLetter("apple",'a');

    }
    public static void removeLetter (String s, char c){
        String output = "";

        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i)!=c){
                output += s.charAt(i);
            }
        }
        System.out.println(output);
    }
}
