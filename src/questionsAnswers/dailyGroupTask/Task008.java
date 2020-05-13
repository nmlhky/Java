package questionsAnswers.dailyGroupTask;

public class Task008 {
    public static void main(String[] args) {
        String[] arr= getBirthdayCake("Jack", 10);
        for (String s: arr ) {
            System.out.println(s);
        }
    }

    public static String[] getBirthdayCake(String name,int age) {
        char c = (age%2==0) ? '#' : '*';
        String[] result = new String[3];
        String temp = "";
        result[1] = c+" "+age+" Happy Birthday "+name+"! "+age+" "+c;

        for (int i = 0; i < result[1].length(); i++) {
            temp += c;
        }
        result[0] = temp;
        result[2] = temp;

        return result;
    }
}
