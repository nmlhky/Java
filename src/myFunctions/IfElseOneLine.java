package myFunctions;

public class IfElseOneLine {
    public static void main(String[] args) {
        //String result = (condition) ? true : false;
        //return (condition) ? true : false;
        int i =1;
        String s = null;

        s = i == 1 ? "bir" : "bir degil";

        if (i==1){
            s = "bir";
        }else {
            s= "bir degil";
        }

        System.out.println(s);

    }
}
