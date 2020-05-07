package javaClassWithMrDuran.day11_20.day17;

public class MinNumber {
    public static void main(String[] args) {
        int[] a ={1,2,3,434,5,45,435,435,-2};
        int min = a[0];
        for (int i : a){
            if (i<min){
                min=i;
            }
        }
        System.out.println(min);
    }
}
