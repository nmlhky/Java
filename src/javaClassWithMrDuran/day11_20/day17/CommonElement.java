package javaClassWithMrDuran.day11_20.day17;

public class CommonElement {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int[] b = {2,6,7,8,9,0};


        for (int i = 0 ; i<a.length ; i++){
            for (int j = 0 ; j<b.length ; j++){
                if (a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
