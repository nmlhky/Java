package javaClassWithMrDuran.day0_10.day09;

public class DateLoop {
    public static void main(String[] args) {
        int m = 1;
        int d = 1;
        /*for ( ; m<13 && d <31 ; d++ ){
            System.out.format("%d / %d / 2020\n",m,d);
            if (d==30){
                d=0;
                m++;
            }

        }*/
        do {
            System.out.format("%d / %d / 2020\n",m,d);
            if (d==30){
                d=0;
                m++;
            }
            d++;
        }while (m<13 && d <31);

    }
}
