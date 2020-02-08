package CodeSignal;

public class TestInputLenght {
    public static void main(String[] args) {
        String st = "aabcgbaa";
        int a = st.length();

        for (int i = 0; i<a ; i++){
            System.out.println(st.charAt(i));
            if (st.charAt(i)!=st.charAt((a-i)-1)) {
                System.out.println(true);
            }
        }

    }
}

 /*   boolean checkPalindrome(String inputString) {
        int a = inputString.length() ;
        boolean t = true;


        for (int i = 0; i<a ; i++){
            if (inputString.charAt(i)!=inputString.charAt((a-i)-1)) {
                t = false;
            }
        }
        if(t==true){return true;}
        else{return false;}
    }
*/
