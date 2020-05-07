package javaClassWithMrDuran.day11_20.day16;

public class LessThanFour {
    public static void main(String[] args) {
        String[] array = {"asd","asfdgvb","asdc","saa"};
        int count = 0;

        for (String i : array){
            if (i.length()<4){
                count++;
            }
        }

        System.out.println(count);
    }
}
