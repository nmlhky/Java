package HackerRank;

public class StringReverse {
    public static void main(String[] args) {
        String str = "maaadaaam";
        System.out.println(stringReverse(str));
    }

    public static boolean stringReverse(String str){
        for (int i = 0 ; i < str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt((str.length()-1)-i)){
                return false;
            }
        }
        return true;
    }

}
