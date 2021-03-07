package codility;

import java.util.LinkedList;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(1041));
    }

    public static int solution(int N) {
        // write your code in Java SE 8

        String bin = Integer.toBinaryString(N);
        int max = 0;
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                list.add(max);
                max = 0;
            }
            else {
                max++;
            }
        }

        return list.stream().mapToInt(v -> v).max().getAsInt();
    }


}
