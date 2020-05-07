package javaClassWithMrDuran.day53_54Questions;

public class Tag {
    public static void main(String[] args) {
        System.out.println(tag("i","hello"));
    }
    public static String tag(String tag,String word){
        return "<"+tag+">" + word +"</"+tag+">";
    }
}
