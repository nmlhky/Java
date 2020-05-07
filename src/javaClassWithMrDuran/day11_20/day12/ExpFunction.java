package javaClassWithMrDuran.day11_20.day12;

public class ExpFunction {
    public static void printMultiHelloWorld(int x){
        for (int i =0; i<x; i++ ){
            System.out.println("hello world");
        }
    }
    public static int add (int x, int y){
        return x+y;
    }
    public static void ascii(){
        for (char i = 0 ; i<256 ; i++){
            System.out.println(i);
        }
    }
    public static void multiplacition() {
        System.out.print("\t");
        for (int n = 1; n < 11; n++){
            System.out.print("\t"+n);
        }
        System.out.println("\n-----------------------------------------------");
        for (int i = 1; i < 11; i++) {
            System.out.print(i+"\t|");
            for (int j = 1; j < 11; j++) {
                System.out.print("\t"+i*j);
            }
            System.out.println();
        }

    }

    public static void odd(int x, int y) {
        for (int i = x; i < y; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        multiplacition();
        System.out.println();
         odd(24,44);
         //ascii();
        //printMultiHelloWorld(15);
        //System.out.println(add(2,3));
    }

}
