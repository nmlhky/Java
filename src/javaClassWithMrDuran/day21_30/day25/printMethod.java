package javaClassWithMrDuran.day21_30.day25;

public class printMethod {
    public static void main(String[] args) {
        printString();
        printString("java");
        printString("java", 20);
    }

    public static void printString (){
        for (int i = 0 ; i< 100 ; i++)
            System.out.println("hello word");
    }

    public static void printString (String word){
        for (int i = 0 ; i< 100 ; i++)
            System.out.println(word);
    }

    public static void printString (String word, int number){
        for (int i = 0 ; i< number ; i++)
            System.out.println(word);
    }


}
