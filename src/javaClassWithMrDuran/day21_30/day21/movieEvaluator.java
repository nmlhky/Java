package javaClassWithMrDuran.day21_30.day21;

public class movieEvaluator {
    public static void main(String[] args) {

    }

    public static String movie(int imdbScore, int totalVotes, int boxOffice){
        int evaluator = imdbScore * totalVotes / boxOffice;

        if (evaluator>10){
            return "watch movie";
        }

        return "do not watch movie";
    }
}
