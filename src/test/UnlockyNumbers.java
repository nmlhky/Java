package test;

public class UnlockyNumbers {
    public static void main(String[] args) {

        int[] arr = new int[100];


        for (int i = 0 ; i< 100 ; i++){
            int random = (int)(Math.random()*1000000);
            if (random != 17){
                arr[i] = random;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 17){
                System.out.println("ERROR");
            }
            System.out.println(arr[i]);
        }


    }

}
