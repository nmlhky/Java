package javaClassWithMrDuran.day11_20.day13;

public class topToBottom {
    public static void main(String[] args) {
        topToBottomPrint("hello");
    }
    public static void topToBottomPrint(String a){
        for (int i = 0 ; i <a.length(); i++){
            System.out.println(a.charAt(i));
        }
    }
}
