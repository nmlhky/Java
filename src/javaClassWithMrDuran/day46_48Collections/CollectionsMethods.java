package javaClassWithMrDuran.day46_48Collections;

import java.util.*;

public class CollectionsMethods {
    public static void main(String[] args) {

    }

    public static void max() {
        List<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(Collections.max(numbers));
    }

    public static void copy() {
        List<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        List<Integer> numbersCopy = new LinkedList<>(Arrays.asList(2,2,5,5,6));

        Collections.copy(numbersCopy,numbers);

        System.out.println(numbersCopy);
    }

    public static void printMethod() {
        List<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        numbers.forEach(System.out::println);

        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void sort(){
        List<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < 15; i++) {
            numbers.add((int) (Math.random()*100 ));
        }
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.reverse(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);
    }

    public static void addAllexp() {
        List<String> fruits = new ArrayList<>();
        Collections.addAll(fruits,"Apple","Orange","banana");
        fruits.forEach(System.out::println);
    }
}
