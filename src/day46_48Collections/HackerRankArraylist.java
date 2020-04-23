package day46_48Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRankArraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true){
            int i = scanner.nextInt();
            if (i==0)break;
            numbers.add(i);

        }
    }
}
