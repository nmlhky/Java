import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 1, 5, 4, 2, 2};
        HashMap<Character ,Character> mp = new HashMap<>(10);
        ArrayList<Integer> list = new ArrayList<>();
        String a = "aabb";
        char x;

        for (int i = 0; i < a.length(); i++) {
            x=a.charAt(i);
            x++;
            mp.put(a.charAt(i),x);

        }
        Iterator hmIterator = mp.entrySet().iterator();
        while (hmIterator.hasNext()){
            Map.Entry mapelement = (Map.Entry)hmIterator.next();
            System.out.println(mapelement.getKey()+"="+mapelement.getValue());
        }
        System.out.println(mp);

    }
}
