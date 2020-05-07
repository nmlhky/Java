package javaClassWithMrDuran.day11_20.day13;

public class Backward {
    public static void main(String[] args) {
        backward("12345sdsfsdfs67");

    }
    public static void backward (String input){
        String output = "";
        int x= input.length() -1 ;
        for (int i = x ; i >=0; i--){
            output +=  input.charAt(i);
        }
        System.out.println(output);
    }
}
