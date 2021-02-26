package questionsAnswers.LeetCode;

public class Hard {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3} , new int[]{2,7}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sum = 0;

        for (int i : nums1) {
            sum += i;
        }

        for (int i : nums2) {
            sum += i;
        }
        System.out.println(sum);

        return sum/ (nums1.length+ nums2.length);
    }
}
