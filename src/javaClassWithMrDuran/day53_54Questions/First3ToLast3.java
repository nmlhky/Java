package javaClassWithMrDuran.day53_54Questions;

public class First3ToLast3 {
    public static void main(String[] args) {
        System.out.println(firstToLast("apple"));
    }

    public static String firstToLast(String str){
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < 3; i++) {
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
