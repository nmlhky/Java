package day13;

public class Backward {
    public static void main(String[] args) {
        backward("1234567");

    }
    public static void backward (String input){
        String output = "";
        int x= input.length() -1 ;
        for (int i = x ; i >=0; i--){
            output = output + input.charAt(i);
        }
        System.out.println(output);
    }
}
