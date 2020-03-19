package day27;

public class Ciphertest {
    public static void main(String[] args) {
        Cipher myCip =new Cipher();
        System.out.println(myCip.getText());
        System.out.println(myCip.cipherText());
        System.out.println(myCip.deCipherText());
    }
}
