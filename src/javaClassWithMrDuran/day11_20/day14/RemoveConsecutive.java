package javaClassWithMrDuran.day11_20.day14;

public class RemoveConsecutive {
    public static void main(String[] args) {
        String aa = removeConsecutive("heeelllo");
        System.out.println(aa);
    }

    public static String removeConsecutive(String s){
        char c = s.charAt(0);
        String output = Character.toString(c);

        for (int i = 1 ; i < s.length() ; i++){
            if (s.charAt(i)!=s.charAt(i-1)){
                output += s.charAt(i);
            }
        }
        return output;
    }
}
