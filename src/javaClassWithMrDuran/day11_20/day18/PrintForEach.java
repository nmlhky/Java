package javaClassWithMrDuran.day11_20.day18;

public class PrintForEach {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = (int) (Math.random() * 100) ;
        }

        for (int number : numbers) {
            System.out.println(number);
        }


        String[] cars = {"bmw" , "mercedes", "audi" , "toyota" , "nissan" , "lexus"};
        for (String car : cars ){
            System.out.println(car);
        }


    }
}
