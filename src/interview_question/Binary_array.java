package interview_question;

public class Binary_array {
    public static void main(String[] args) {
        String[] arr = {"00011" , "01010"};
        System.out.println(binary(arr));
    }

    public static String binary(String[] arr){
        String result = "";

        for (int i = 0; i < arr[0].length(); i++) {
            if (arr[0].charAt(i) == '1' || arr[1].charAt(i) == '1') result += '1';
            else result += '0';
        }

        return result;
    }
}
