package test;

public class test {
    public static void main(String[] args) {
        String str = "input";

//        //first way
//        StringBuilder strbul = new StringBuilder(str);
//
//        String rev = strbul.reverse().toString().toUpperCase();
//
//        return rev;
//
//        //second way
//        String s = "";
//
//        for (int i = 0; i < str.length(); i++) {
//        s += str.toUpperCase().charAt((str.length()-1)-i);
//        }
//
//        return s;

        int[]  nums = {1, 2, 3, 5 ,2 , 1, 0 };

        int count = 0;
        for (int i = 0; i < nums.length  ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) count++;
            }
        }

        System.out.println("count" + count);
        int[] arr = new int[nums.length-count];
        int index = 1;

        arr[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {

                if (nums[i] != nums[i-1]) {
                    arr[index] = nums[i];
                    //++index;
                }

        }

        for (int i :
                arr) {
            System.out.println(i);
        }


    }
}
