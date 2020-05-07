package javaClassWithMrDuran.day11_20.day14;

public class SomeLetter {
    public static void main(String[] args) {
        System.out.println(BetweenTwoCharacter("Hello",1,3));
    }
    public static String BetweenTwoCharacter(String s, int x, int y){
        String output = "";

        for (int i = x ; i<= y ; i++){
            output += s.charAt(i);
        }

        return output;
    }
}
