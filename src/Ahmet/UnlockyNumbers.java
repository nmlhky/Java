package Ahmet;

public class UnlockyNumbers {
    public static void main(String[] args) {

        int[] arr = new int[1000000];

        for (int i = 0 ; i< 1000000 ; i++){
            arr[i] = (int)(Math.random()*1000000);
        }

        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 17){
                bool = true;
            }
        }

        if(bool == true){
            System.out.println("Che Brutto!");
        }else {
            System.out.println("Buona fortuna!");
        }

    }
}
