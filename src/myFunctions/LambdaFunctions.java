package myFunctions;

import java.util.*;
import java.util.stream.Collectors;

//filter --> tek tek bakip filtre uyguluyor
//map --> tek tek kosulu uyguluyor karesini alma gibi
//reduce ( x, y -> x+y ) sonucu x e atayim donguden geleni y ye atiyor. butun degerlerin toplamini alma.
//collect collect(Collectors.toList()) --> toplayip bir seye atiyor

//distinct()
//sorted() sorted(Comparator.reverseOrder())
//get optionel int to int

public class LambdaFunctions {
    public static void main(String[] args) {
        //her chara bakip buyuk mu kucuk mu diye kontrol etme.
        String s = "myClassNameIsStream";
        long countWords =  s.codePoints().filter(Character::isUpperCase).count();
        System.out.println(countWords);

        // her elemana bakip kontrol
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = strings.stream().filter(String::isEmpty).count();
        System.out.println(count);


        List<String> list2 = Arrays.asList("abc", "bc", "efg", "abcd", "jkl");
        list2.stream().sorted().limit(3).forEach(LambdaFunctions::getPrint);
        list2 = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);


        List<Integer> list = Arrays.asList(12,9,13,4,9,2,4,12,15);

        //printEvenListElFunctional //  12 4 2 4 12
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t + " "));
        list.stream().filter(t->t%2==0).forEach(System.out::print);
        list.stream().filter(LambdaFunctions::getEvens).forEach(LambdaFunctions::getPrint);

        //getSquare //81 169 81 225
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t + " "));
        list.stream().filter(LambdaFunctions::getOdds).map(LambdaFunctions::getSquare).forEach(LambdaFunctions::getPrint);

        //sumOfOdds // 556
        System.out.println("\n"+
        list.stream().filter(LambdaFunctions::getOdds).map(LambdaFunctions::getSquare).reduce(0, (x, y)->x+y)
                +"\n"+
        list.stream().filter(LambdaFunctions::getOdds).map(LambdaFunctions::getSquare).reduce(Integer::sum).get()
                +"\n"+
        list.stream().filter(LambdaFunctions::getOdds).map(LambdaFunctions::getSquare).reduce(Math::addExact)
                +"\n"+
        list.stream().filter(LambdaFunctions::getOdds).map(LambdaFunctions::getSquare).reduce(LambdaFunctions::getSum)
        );

        //maxElement //15
        System.out.println("\n"+
        list.stream().reduce((x,y)->x>y ? x : y)
                +"\n"+
        list.stream().reduce(Integer::max)
                +"\n"+
        list.stream().reduce(Math::max)
                +"\n"+
        list.stream().reduce(LambdaFunctions::getMax)
                +"\n"+
        list.stream().sorted().reduce((x,y)->y)
                +"\n"+
        list.stream().sorted().reduce((x,y)->x)
        );

        //getOddSquaresSorted //81 169 225
        System.out.println("\n"+
        list.stream().
                filter(LambdaFunctions::getOdds).
                distinct().
                map(LambdaFunctions::getSquare).
                sorted().
                collect(Collectors.toList())
        );

        //getOddSquaresRevSorted //225 169 81
        System.out.println("\n"+
        list.stream().
                filter(LambdaFunctions::getOdds).
                distinct().
                map(LambdaFunctions::getSquare).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList())
        );


    }

    public static void getPrint(int a){
        System.out.print(a + " ");
    }

    public static void getPrint(String s){
        System.out.print(s + " ");
    }

    public static boolean getOdds(int a){
        return (a%2!=0) ;
    }

    public static boolean getEvens(int a){
        return (a%2==0) ;
    }

    public static int getSquare(int a){
        return a*a;
    }

    public static int getSum(int a, int b){
        return a+b;
    }

    public static int getMax(int x, int y){
        return x>y ? x : y;
    }
}
