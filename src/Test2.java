import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {5,4,6,8,1,8,2};
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    public static int[] sortArray(int[] arr){
        int temp;

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr [j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    System.out.println("i = "+i);
                }
            }
        }
        return arr;
    }
}
