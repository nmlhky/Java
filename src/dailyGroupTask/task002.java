package dailyGroupTask;

public class task002 {
    public static void main(String[] args) {

    }

    public static String capLast(String str) {
        String s = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i+1)== ' ')  s += Character.toUpperCase(str.charAt(i));
            else s += str.charAt(i);
        }

        s += Character.toUpperCase(str.charAt(s.length()));

        return s;
    }
}
