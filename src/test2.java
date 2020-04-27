import java.util.*;


public class test2 {
    public static void main(String[] args) {

        TreeMap<String, Integer> tree2 = new TreeMap<>();
        tree2.put("xsd",4153);
        tree2.put("asf",4153);
        tree2.putAll(tree2);
        System.out.println(tree2);

        List<Integer> a = new ArrayList<>(List.of(1,2,3));
        a.addAll(a);
        System.out.println(a);


    }
}
