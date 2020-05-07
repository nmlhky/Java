package javaClassWithMrDuran.day11_20.day16;

public class arrayaddnumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,54,65,678,54};
        int countadd = 0;
        int counteven = 0;

        for (int i : numbers){
            if (i %2 == 0){
                counteven++;
            }else {
                countadd++;
            }
        }
        System.out.println(countadd + " number add");
        System.out.println(counteven+ " number even");
    }
}
