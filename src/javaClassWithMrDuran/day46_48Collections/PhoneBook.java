package javaClassWithMrDuran.day46_48Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class PhoneBook {
    public static void main(String[] args) {
        phoneBook();
    }

    public static void phoneBook (){
        TreeSet<String> book = new TreeSet<String>();
        book.add("Daniel Day-Lewis 123 456 7890");
        book.add("Johnny Depp : 252 521 7531");
        book.add("Brad pitt : 125 215 2154");
        book.add("Leonardo DiCaprio : 456 745 1235");
        book.add("Joaquin Phoenix : 456 852 2418");

        Iterator<String> iterator = book.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
