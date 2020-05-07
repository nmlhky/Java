package javaClassWithMrDuran.day21_30.day21;

public class arrayCount {
    public static void main(String[] args) {
        char[] arr = {'a' , 'b'  ,  '4' , ' ' , '3'};
        counter(arr);
    }

    public static void counter (char[] array){

        int space = 0 , number = 0 , AtoZ = 0 , aToz = 0 , EndOfLine = 0;

        for (int i = 0 ; i<array.length ; i++){

            if (array[i] == ' ')
                space++;

            if ((int)(array[i]) > 47 &&  (int)array[i] < 58)
                number++;

            if ((int)(array[i]) > 65 &&  (int)array[i] < 91)
                AtoZ++;

            if ((int)(array[i]) > 96 &&  (int)array[i] < 123)
                aToz++;

            if (array[i] == '\0')
                EndOfLine++;

        }

        System.out.println("space : "  + space);
        System.out.println("number : "  + number);
        System.out.println("Capital Letter : "  + AtoZ);
        System.out.println("Lower Letter : "  + aToz);
        System.out.println("end of line : "  + EndOfLine);

    }
}
