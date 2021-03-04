package interview_question;

public class GetSequenceSum {
    public static void main(String[] args) {
        System.out.println(getSequenceSum(5,9,6));
        System.out.println(getSequenceSum2(5,9,6));
    }

    public static long getSequenceSum(int i,int j,int k){
        long sum = 0;

        for (int l = i; l < j; l++) {
            sum += l;
        }
        for (int l = j; l >= k; l--) {
            sum += l;
        }

        return sum;
    }

    public static int getSequenceSum2(int i,int j,int k){
        int sum = 0;

        for (int l = i; l < j; l++) {
            sum += l;
        }
        for (int l = j; l >= k; l--) {
            sum += l;
        }

        return sum;
    }
}
