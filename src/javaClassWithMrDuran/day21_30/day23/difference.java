package javaClassWithMrDuran.day21_30.day23;


public class difference {
    public static void main(String[] args) {
        int[] a = {1,5,8,465,46,58,465,6845};

        System.out.println(MaxDifference2(a));

    }

    public static int MaxDifference (int[] a){
        int maxDifference = 0;
        int diffrence;

        for (int i = 0 ; i < a.length-1  ;  i++ ) {
            diffrence = a[i] - a[i+1];
            diffrence = Math.abs(diffrence); // if negatif difference,  make it positive
            if (diffrence > maxDifference)
                maxDifference = diffrence;
        }

        return maxDifference;
    }

    public static int MaxDifference2 (int[] a){
        int[] dif = new int[a.length-1];//create empty array for difference

        for (int i = 0 ; i<a.length-1 ; i++){
            dif[i] = Math.abs(a[i] - a[i+1]);//make a pozitive number
        }

        //finding maximum
        int maximum = dif[0];
        int index = 0;

        for (int i=1; i<dif.length; i++) {
            if (dif[i] > maximum) {
                maximum = dif[i];
                index = i;
            }
        }

        return maximum;
    }

}