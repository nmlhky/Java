package javaClassWithMrDuran.day11_20.day17;

public class mergeArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {55,66,777,8};

        int[] c = new int[a.length+b.length];

        int x = c.length-b.length;

        for (int i = 0 ; i<c.length; i++){
            if (i<a.length){
                c[i]=a[i];
            }
            if (i<b.length){
                c[x]=b[i];
                x++;
            }

        }

        for (int j = 0; j < c.length; j++) {
            System.out.println(c[j]);
        }
    }
}
