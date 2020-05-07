package javaClassWithMrDuran.day21_30.day26;

import java.util.Arrays;

public class StringOperationsTest {
    public static void main(String[] args) {
        StringOperations myStr = new StringOperations("java is super fun");
        System.out.println(myStr.returnReversed());
        System.out.println(myStr.returnCapitalized());
        System.out.println(Arrays.toString(myStr.stringToArrayHardWay()));


    }

}
