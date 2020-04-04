package test;

public class Polindrome {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("orhan");

        String x = sb.toString();

        if(x.equals(sb.reverse())){
            System.out.println("polindrone");
        }else{
            System.out.println("not");
        }

    }
}
