package javaClassWithMrDuran.day53_54Questions;

import java.util.ArrayList;

public class Questions {
    public static void main(String[] args) {
        //System.out.println(repeatSpeartor("word","X",3));

        String num = "7sda1";
        //System.out.println(sumAllNumber(num));

        System.out.println(fact(100));
    }

    public static String repeatSpeartor(String word,String sep,int count){
        String result = word;
        for (int i = 0; i < count-1; i++) {
            result += sep + word;
        }
        return result;
    }

    public static int sumNumber(String s){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int index =0;
        int temp = 0;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))){
                temp *= 10;
                temp += Character.getNumericValue(s.charAt(i));
            }
            if (!Character.isDigit(s.charAt(i))){
                list.add(index,temp);
                temp = 0;
                index++;
            }
        }
        list.add(index,temp);

        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    public static int sumAllNumber(String s){
        return s.codePoints().filter(Character::isDigit).sum();
    }

    public static long fact(long number){
        if (number==1) return 1;
        return number * fact(number-1);
    }

}
