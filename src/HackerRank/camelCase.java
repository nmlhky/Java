package questionsAnswers.HackerRank;

public class camelCase {
    public static void main(String[] args) {
        System.out.println(countUpperCase("dassadAasddAd"));
    }

    public static  int countLetter(String s){
        int count =1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) count++;
        }

        return count;
    }

    private static long countUpperCase(String s) {
        return s.codePoints().filter(Character::isUpperCase).count()+1;
    }


}
