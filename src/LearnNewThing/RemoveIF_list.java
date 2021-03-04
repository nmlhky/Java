package LearnNewThing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIF_list {
    public static void main(String[] args) {
        String[] arr = {"hi","how","are","you"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        if (list.removeIf( s -> s.equals("are"))){
            System.out.println( "removed");
        }

        System.out.println(list);
    }
}
