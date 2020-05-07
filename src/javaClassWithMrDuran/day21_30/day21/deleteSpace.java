package javaClassWithMrDuran.day21_30.day21;

public class deleteSpace {
    public static void main(String[] args) {

        System.out.println(DeleteSpace("asd asdsa  fds ads dsf s"));
    }

    public static String DeleteSpace (String sentence){
        String result = "";
        for (int i = 0 ; i<sentence.length() ; i++){
            if (sentence.charAt(i) != ' ' )
                result += sentence.charAt(i);

        }

        return result;
    }
}
