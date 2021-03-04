package edabit;

public class Medium {
    public static void main(String[] args) {


        System.out.println(encrypt("apple"));

    }

    public static String encrypt(String word) {

        //step 1
        StringBuilder sb = new StringBuilder(word);
        String str = sb.reverse().toString();

        //step2
        str = str.replace("a","0");
        str = str.replace("e","1");
        str = str.replace("o","2");
        str = str.replace("u","3");

        //step3
        str += "aca";

        return str;
    }

    public static String diEncrypt(String word) {
        String str = "";

        for (int i = 0; i < word.length()-3; i++) {
            str += word.charAt(i);
        }

        str = str.replace("0","a");
        str = str.replace("1","e");
        str = str.replace("2","o");
        str = str.replace("3","u");

        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString();

    }
}
