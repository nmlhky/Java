package javaClassWithMrDuran.day11_20.day13;

public class ReverseCheck {
    public static void main(String[] args) {
        System.out.println(ReverseCheck("racecar"));
    }

    public static boolean ReverseCheck(String text){
        int n = text.length();

        boolean check = true;
        for (int i = 0 ; i < n/2 ; i++){
            if(text.charAt(i) != text.charAt((n-1)-i)){
                check = false;
            }
        }
        return check;
    }
}
