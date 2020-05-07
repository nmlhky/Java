package javaClassWithMrDuran.day11_20.day13;

public class Number5 {
    public static void main(String[] args) {
        PrintWithFor();
        PrintWithWhile();
    }

    public static void PrintWithFor(){
        for (int i = 1 ; i<26 ; ){
            for (int j = 0 ; j<5 ; j++){
                System.out.print(i+"\t");
                i++;
            }
            System.out.println();
        }
    }
    public static void PrintWithWhile(){
        int n = 1;
        while (n<25){
            int m = 0;
            while (m<5){
                System.out.print(n+"\t");
                m++;
                n++;
            }
            System.out.println();
        }
    }
}
