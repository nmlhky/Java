package questionsAnswers.dailyGroupTask;

public class Task009 {
    public static void main(String[] args) {

    }

    public static int countTrue(String[] arr){
        int count = 0;
        for (String s : arr) {
            if (s.equals("true")) count++;
        }
        return count;
    }
}
