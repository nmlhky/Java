package day20;

public class test {
    public static void main(String[] args) {

        int[][] array  = createArray(10);
        printArray(array);
    }

    public static int[][] createArray (int x){
        int[][] arr = new int[x][x];
        int counter = 1;

        for (int i = 0 ; i<x ; i++){
            for (int j =0 ; j<x ; j++){
                arr[i][j] = counter;
                counter++;
            }
        }

        return arr;
    }

    public static void printArray (int[][] array){

        for (int i = 0 ; i< array.length ; i++ ){
            for (int j = 0 ; j<array[0].length ; j++ ){
                System.out.print("\t" + array[i][j]);
            }
            System.out.println();
        }

        for (int[] m : array){
            for (int n : m){
                System.out.print("\t" + n);
            }
            System.out.println();
        }

    }

}