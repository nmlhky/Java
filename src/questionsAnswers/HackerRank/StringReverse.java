package questionsAnswers.HackerRank;

public class StringReverse {
    public static void main(String[] args) {
        String A = "maaadaaam";
        int n = A.length();

        String yes = "yes";
        for (int i = 0 ; i < n/2 ; i++){
            if(A.charAt(i) != A.charAt((n-1)-i)){
                yes = "no";
            }
        }

        System.out.println(yes);
    }
}
