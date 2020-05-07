package javaClassWithMrDuran.day21_30.day25;

public class DublicateInt {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5,6,7,55};
        int[] a =dublicate(arr);

        for (int i : a){
            System.out.println(i);
        }
    }

    public static int[] dublicate(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] ==arr[j])
                    arr[j] = 0;

         return arr;
    }
}
