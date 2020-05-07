package javaClassWithMrDuran.day11_20.day18;

public class RandomString {
    public static void main(String[] args) {
        String[] arrayString = new String[20];
        for (int i = 0 ; i<arrayString.length ; i++){
            arrayString[i] = randomString();
        }
        for (String word : arrayString){
            System.out.println(word);
        }
    }

    public static String randomString(){
        int n = (int) (Math.random() * 10) ;

        String word = "";

        for (int i = 0; i < n; i++) {
            word += (char ) ((int) (Math.random() * 26) + 97);
        }

        return word;
    }
}
