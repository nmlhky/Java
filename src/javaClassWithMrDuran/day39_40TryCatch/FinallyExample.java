package javaClassWithMrDuran.day39_40TryCatch;

public class FinallyExample {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{3,4}};

        int[][] arr2 = ArrayColomToRow(arr1);

        for (int[] arr : arr2) {
            for (int number : arr) {
                System.out.print(number);
            }
            System.out.println();
        }

    }

    public static int[][] ArrayColomToRow(int[][] arr1){

        int[][] arr2 = new int[arr1.length][arr1[0].length];

        try {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    arr2[i][j] = arr1[j][i];
                }
            }
        }
        catch (Exception e){
            System.out.println("error");
        }
        finally {
            System.out.println("Hello word");
        }

        return arr2;

    }

}


