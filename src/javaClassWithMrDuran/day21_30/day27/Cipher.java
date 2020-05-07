package javaClassWithMrDuran.day21_30.day27;

public class Cipher {
    private String text;
    private int shift;

    public Cipher(){
        this.text="java";
        this.shift=1;
    }
    public Cipher(String text,int shift){
        this.text=text;
        this.shift=shift;
    }
    public void setText(String newText){
        this.text=newText;
    }
    public String getText(){
        return this.text;
    }
    public int getShift(){
        return this.shift;
    }
    public String cipherText(){
        String result="";
        char letter;
        for (int i = 0 ; i < this.text.length() ; i++) {
            letter=this.text.charAt(i);
            letter+=this.shift;
            result+=letter;
        }
        this.text=result;
        return this.text;
    }
    public String deCipherText(){
        String result="";
        char letter;
        for (int i = 0 ; i < this.text.length() ; i++) {
            letter=this.text.charAt(i);
            letter-=this.shift;
            result+=letter;
        }
        this.text=result;
        return this.text;
    }
}
