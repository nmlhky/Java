package javaClassWithMrDuran.day0_10.day09;

public class DoWhile3 {
    public static void main(String[] args) {

       for (int m = 1; m <=12 ; m++ ){

           if (m ==1 || m==3 || m==5 || m==7 ||m==8||m==10||m==12) {
               for (int d = 1; d <= 31; d++) {
                   System.out.format("%d / %d / 2019\n", m, d);
               }
           }else if (m==2){
               for (int d = 1; d <= 28; d++) {
                   System.out.format("%d / %d / 2019\n", m, d);
               }
           }else{
               for (int d = 1; d <= 30; d++) {
                   System.out.format("%d / %d / 2019\n", m, d);
               }
           }
           if(m!=12)System.out.println("-------");
        }

    }
}
