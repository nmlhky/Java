package javaClassWithMrDuran.day21_30.day24;

public class SeperateZero {
    public static void main(String[] args) {
        int[] array = {1,5,0,0,5,2,5,2};

        int[] array2 = sep(array);

        for (int i : array2){
            System.out.println(i);
        }


    }

    public static int[] seprateZero(int[] arr){

        int[] arr2 = new int[arr.length];
        int count = 0 ;
        int countreverse = arr.length-1;

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] != 0 ){
                arr2[count] = arr[i];
                count++;
                countreverse--;
            }
            else{
                arr2[countreverse] = arr[i];
            }
        }

        return arr2;
    }

    public static int[] sep(int[] arr){
        int[] arr2=new int[arr.length];
        int count = 0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr2[count]=arr[i];
                count++;
            }
        }

        return arr2;
    }

}
