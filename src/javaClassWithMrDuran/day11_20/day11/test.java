package javaClassWithMrDuran.day11_20.day11;

public class test {
    public static void main(String[] args) {
        int a;
        int b = 5;
        for(a=b++ ; a!=b ; ++a){
            System.out.println(a+" "+b);
            ++b;
            if (a>6){
                a=0;
                b=1;
            }
        }
    }
}
