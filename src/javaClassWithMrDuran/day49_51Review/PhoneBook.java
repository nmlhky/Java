package javaClassWithMrDuran.day49_51Review;

import java.util.Iterator;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        phoneBook();
    }

    public static void phoneBook (){
        TreeMap<String , Integer> book = new TreeMap<>();
        book.put("Daniel Day-Lewis", 1234567890);
        book.put("Johnny Depp", 252527531);
        book.put("Brad pitt", 252152154);
        book.put("Leonardo DiCaprio", 456745135);
        book.put("Joaquin Phoenix", 456852418);

        Iterator<String> iterator = book.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " : (" + book.get(key).toString().substring(0,3) + ") " + book.get(key).toString().substring(3,6) + "-" + book.get(key).toString().substring(5,9) );
        }
    }
}
