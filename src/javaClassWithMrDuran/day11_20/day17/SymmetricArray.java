package javaClassWithMrDuran.day11_20.day17;

public class SymmetricArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,4,3,2,1};
        int n =a.length;
        boolean isSymmetric = true;

        for (int i = 0 ; i < n/2 ; i++){
            if(a[i] != a[(n-1)-i]){
                isSymmetric = false;
            }
        }

        System.out.println(isSymmetric);
    }
}
