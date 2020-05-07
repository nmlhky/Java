package javaClassWithMrDuran.day0_10.day10;

public class While100to999 {
    public static void main(String[] args) {
        int i=1,j;
        while (i<10){
            j=0;
            while(j<10){
                System.out.println(i+""+j);
                j++;
            }
            i++;
        }
    }
}
