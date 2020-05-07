package javaClassWithMrDuran.day41_43ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDinStringList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>(2);

        list.add( new ArrayList<>(Arrays.asList("Java", "is", "fun")));
        list.add(new ArrayList<> (Arrays.asList("Java", "is", "super")));

        for (ArrayList element :  list) {
            System.out.println(element);
        }

        numberOfEveryUppercase(list);
    }


    public static void numberOfEveryUppercase(ArrayList<ArrayList<String>> arr){

        int counterWord;
        int counterRow;
        for(int i=0 ; i<arr.size() ; i++){ //to fetch 1 dim String arrays
            counterRow=0;
            for(int j=0 ; j<arr.get(i).size() ; j++){ //to fetch String elements
                counterWord=0;
                for(int k=0 ; k<arr.get(i).get(j).length() ;k++ ){ //to fetch chars
                    if(Character.isUpperCase(arr.get(i).get(j).charAt(k))){
                        counterWord++;
                    }
                }
                counterRow+=counterWord;
            }
            System.out.println("There are "+counterRow+" upper cases at row"+(i+1));
        }
    }


    public static void numberOfUppercase(ArrayList<ArrayList<String>> arr) {
        int count;

        for (int i = 0; i < arr.size(); i++) {
            count = 0 ;
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (Character.isUpperCase(arr.get(i).get(j).charAt(0))) count++;
            }
            System.out.println( "there is "+ count +" upper case in row " + i);
        }
    }

    public static void numberOfLowercase(ArrayList<ArrayList<String>> arr) {
        int count;

        for (int i = 0; i < arr.size(); i++) {
            count = 0 ;
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (Character.isLowerCase(arr.get(i).get(j).charAt(0))) count++;
            }
            System.out.println( "there is "+ count +" lower case in row " + i);
        }
    }
}
