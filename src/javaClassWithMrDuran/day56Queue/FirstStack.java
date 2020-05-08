package javaClassWithMrDuran.day56Queue;

public class FirstStack {
    public static void main(String[] args) {
        System.out.println(isBalanced("{}{{{}}"));
    }

    public static boolean isBalanced(String input){
        while(input.length() != (input = input.replaceAll("\\{\\}", "")).length());

        return (input.isEmpty());
    }

}
