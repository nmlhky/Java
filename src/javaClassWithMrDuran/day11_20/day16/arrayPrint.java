package javaClassWithMrDuran.day11_20.day16;

public class arrayPrint {
    public static void main(String[] args) {
        String[] city = {"NYC","L.A.","Ann Arbor","Chicago","Minnepolis","Albuquerque","Salt lake city"};

        for (int i = 0 ;i<city.length ; i++){
            System.out.print(city[i] + "\t");
        }
        System.out.println();

        city[1] = "los angeles";

        /*for (int j = city.length ; j>0 ; j--){
            System.out.print(city[j-1] + "\t");
        }
        System.out.println();

         */

        for (String k : city){
            System.out.print(k + "\t");
        }


    }

}