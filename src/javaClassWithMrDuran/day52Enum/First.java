package javaClassWithMrDuran.day52Enum;

public class First {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        Level myEnumVar = Level.LOW;
        System.out.println(myEnumVar);
    }

}
