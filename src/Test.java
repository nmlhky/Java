import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {1,2,3,4,5,6,7,8,9,10};


    }

    public static int firstRep(int[] arr){
        HashSet<Integer> list = new HashSet<>();

        for (int i = 0; i < arr.length; i++)
            if (!list.add(arr[i]))
                return arr[i];



        return -1;

    }
}
