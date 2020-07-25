package questionsAnswers;

public class Oce {
    public static void main(String[] args) {
        //tekrar bakacaklarim
        //2,25,28,31

        //27
        int i = 0;
        do {
            System.out.println(i);
        }while (i++ < 5);

        i = 0;
        while (++i <5){
            System.out.println(i);

        }

        System.out.println();


        //tanesi 2 lik,  5 tane array tutuyor
        String[][] arrrrr = new String[5][2];
        System.out.println(arrrrr[1].length);


        //new booleen false
        boolean bo = new Boolean(null);
        System.out.println(bo);

        //soru 11
        dosum(10,20); // int
        dosum(10l,20l); // float
        dosum(10.0,20.0); //double
        dosum(10.0f,20.0f); //float

        //soru 24
        //concat ekleme yapiyor. eger bossa throw null pointer exception.

        //soru 30
        int a = 1;
        int b = 2;
        if (a++ < ++b){} // 1 < 2 true


    }

    public static void dosum(int x, int y){
        System.out.println("int");
    }
    public static void dosum(double x, double y){
        System.out.println("double");
    }
    public static void dosum(float x, float y){
        System.out.println("float");
    }
}
