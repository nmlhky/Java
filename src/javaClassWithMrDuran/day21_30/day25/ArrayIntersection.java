package javaClassWithMrDuran.day21_30.day25;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] x = {1,2,3};
        int[] y = {2,4,5,6,3,3,3};

        intersection(x,y);
    }

    public static void intersection (int[] arr1 , int[] arr2) {
        int[] commons = new int[arr1.length + arr2.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]) {
                    for (int k = 0; k < commons.length; k++) {
                        if (arr1[i] == commons[k]) {
                            commons[count] = arr1[i];
                            count++;
                            break;
                        }else {
                            System.out.println(arr1[i]);
                            break;
                        }
                    }
                }
            }
         }
    }
}
