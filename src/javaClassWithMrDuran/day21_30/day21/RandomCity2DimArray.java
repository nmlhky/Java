package javaClassWithMrDuran.day21_30.day21;

public class RandomCity2DimArray {
    public static void main(String[] args) {
        String[][] Randomcity = CreateRandomCity();
        ///printArray(Randomcity);
        //printFirstLetterA(Randomcity);
        //printReverse(Randomcity);
        printAToH(Randomcity);
    }

    public static String[][] CreateRandomCity(){
        String[][] RandomCityArray = new String [3][3];
        String[] city = {"NYC","L.A" , "Atlanta" , "houston" , "Dallas" , "minnosota" , "denver" , "cleverland" , "San Diego"};


        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j <3 ; j++) {
                RandomCityArray[i][j] = city[ (int) (Math.random() * 9) ];
            }
        }
        return RandomCityArray;

    }

    public static void printArray(String[][] x){

        for (int i = 0 ; i < x.length ; i++){
            for (int j = 0 ; j < x[0].length ; j++) {

                System.out.print( x[i][j] + "\t\t\t");

            }
            System.out.println();
        }
    }

    public static void printFirstLetterA(String[][] x){
        for (int i = 0 ; i < x.length ; i++){
            for (int j = 0 ; j < x[0].length ; j++) {
                if (x[i][j].charAt(0) == 'A' || x[i][j].charAt(0) == 'a')
                    System.out.println( x[i][j] );
            }
        }
    }

    public static void printReverse(String[][] x){
        for (int i = 0 ; i < x.length ; i++){
            for (int j = 0 ; j < x[0].length ; j++) {

                String reverse = "";

                for (int k = x[i][j].length() - 1 ; k>= 0 ; k-- ){

                    reverse +=  x[i][j].charAt(k) ;
                }

                System.out.print(reverse + " \t\t\t");

            }
            System.out.println();
        }
    }

    public static void printAToH(String[][] x){
        for (int i = 0 ; i < x.length ; i++){
            for (int j = 0 ; j < x[0].length ; j++) {
                String lowerCase =  x[i][j].toLowerCase();
                if ( lowerCase.charAt(0) > 96 && lowerCase.charAt(0) < 105 )
                    System.out.println( x[i][j] );
            }
        }
    }


}
