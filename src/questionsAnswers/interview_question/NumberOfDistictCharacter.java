package questionsAnswers.interview_question;


public class NumberOfDistictCharacter {
    public static void main(String[] args) {
        System.out.println(numberOfDistictCharacter("may name isiaaisxvs granar","a"));
    }

    public static int numberOfDistictCharacter2(String input1, String input2){

        if (!input1.contains(input2)) return -1;

        int start = input1.indexOf(input2);
        int end = input1.lastIndexOf(input2);

        String s = input1.substring(start,end)
                .replaceAll(" ","")
                .replaceAll(input2,"");

        return (int)s.chars().mapToObj(e -> Character.toString((char) e))
                .distinct().count();

    }


    public static int numberOfDistictCharacter(String input1, String input2){

        return input1.contains(input2) ?
                (int)input1.substring(input1.indexOf(input2),input1.lastIndexOf(input2))
                .replaceAll(" ","")
                .replaceAll(input2,"")
                .chars().mapToObj(e -> Character.toString((char) e))
                .distinct().count()
                : -1;

    }

}
