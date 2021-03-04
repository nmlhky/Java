package LearnNewThing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        //her chara bakip buyuk mu kucuk mu diye kontrol etme.
        String s = "myClassNameIsStream";
        long countWords =  s.codePoints().filter(Character::isUpperCase).count()+1;
        System.out.println(countWords);

        // her elemana bakip kontrol
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = strings.stream().filter(String::isEmpty).count();
        System.out.println(count);


        List<String> list = Arrays.asList("abc", "bc", "efg", "abcd", "jkl");
        list.stream().sorted().limit(3).forEach(System.out::println);
        list = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list);


    }
}
