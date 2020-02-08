package CodeSignal;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] inputArray = new int[]{ 1,2,3,6,7,8,9,4,4,6,7,67 };

        int a = inputArray.length ;
        System.out.println(a);
        System.out.println("-------");
        int max = 0;

        for (int i = 0; i<a-1 ; i++){

            int multiply = inputArray[i]*inputArray[i+1];
            if (multiply > max ){max= multiply;}
            System.out.println(max);
        }


    }
}




