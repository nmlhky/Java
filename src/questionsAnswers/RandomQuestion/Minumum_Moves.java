package questionsAnswers.RandomQuestion;

public class Minumum_Moves {
    public static void main(String[] args) {
        int [] arr1={123,543};
        int [] arr2={321,279};
        System.out.println(minimumMoves(arr1,arr2));
        int [] arr3={123,456};
        int [] arr4={789,321};
        System.out.println(minimumMoves(arr3,arr4));

    }
    public static int minimumMoves(int [] arr1, int [] arr2){

        int sum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum += Math.abs(arr1[i] %10 - arr2[i] %10 );
                arr1[i] = arr1[i] / 10;
                arr2[i] = arr2[i] / 10;
            }
        }

        return sum;
    }

}
