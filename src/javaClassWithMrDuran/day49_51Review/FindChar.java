package javaClassWithMrDuran.day49_51Review;

import java.util.ArrayList;
import java.util.List;

public class FindChar {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = createArraylsit();
        System.out.println(list);
        findLongestWord(list);
    }

    public static ArrayList<ArrayList<String>> createArraylsit(){
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(new ArrayList<>(List.of("Apple","orange","peace","Grape")));
        list.add(new ArrayList<>(List.of("Persimon","Banana","Pear","lychi")));
        list.add(new ArrayList<>(List.of("Blackbery","Strawberry","Mandarin","Nectarin")));

        return list;
    }

    public static void  countUppercase(ArrayList<ArrayList<String>> list){
        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                for (int k = 0; k < list.get(i).get(j).length(); k++) {
                    if (Character.isUpperCase(list.get(i).get(j).charAt(k))) upperCase++;
                    if (Character.isLowerCase(list.get(i).get(j).charAt(k))) lowerCase++;
                }
            }
            System.out.println("there is " + upperCase +" upercase, "+lowerCase+" lowercase char  in row " + i);

            upperCase = 0;
            lowerCase = 0;
        }

    }


    public static void  findLongestWord(ArrayList<ArrayList<String>> list){
        int longest = 0;
        int longesti = 0;
        int longestj = 0;

        int shortest = list.get(0).get(0).length();
        int shortesti = 0;
        int shortestj = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                if (list.get(i).get(j).length() > longest) {
                    longest = list.get(i).get(j).length();
                    longesti = i;
                    longestj = j;
                }
                if (list.get(i).get(j).length() < shortest) {
                    shortest = list.get(i).get(j).length();
                    shortesti = i;
                    shortestj = j;
                }
            }
        }

        System.out.println("longest word : "+ list.get(longesti).get(longestj));
        System.out.println("shortest word : "+ list.get(shortesti).get(shortestj));

    }




}
