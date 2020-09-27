package questionsAnswers;

public class OCA_notlar {
    public static void main(String[] args) {
        //yanlislarim
        //20,24,25,31,42,69,77,84,93,136 164
        //look again
        //46 48 50 56 57 100 101 143 154 155 168 173

        //new booleen false
        boolean bo = new Boolean(null);
        System.out.println(bo);


        //tanesi 2 lik,  5 tane array tutuyor
        String[][] arrrrr = new String[5][2];
        System.out.println(arrrrr[4].length);

        //enhanced for loop = foreach

        //x++ 1   ++x 2
        int x = 1;
        int y = 1;
        System.out.println( ( x++ < ++y ) ? ("x = "+ x + " | y = "+ y) : "false");


        //ans`ler hep farkli ans.
        try {
            int num = 10;
            int div = 1;
            int ans = num/ div;
        } catch (ArithmeticException ae){
            int ans = 0;
        }
        //System.out.println(ans);

        //importda package degil class import yapilir


        //
        int numbers [];
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers = new int[4];
        numbers[2] = 30;
        numbers[3] = 40;
        for (int n : numbers) {
            System.out.println(n);// 0 0 30 40
        }

        // animal boncuk = new cat() >> is cat or animal?







    }
}
