package javaClassWithMrDuran.day21_30.day24;

public class arrayFindDublicate {
    public static void main(String[] args) {
        String[] arr={"aa","bb","cc","dd","aa","cc"};
       dublicate(arr);

        //for(String i :a){         System.out.println(i);      }
    }

    public static void dublicate(String[] arr) {

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i].equals(arr[j]))
                    System.out.println(arr[i]);
    }
}
