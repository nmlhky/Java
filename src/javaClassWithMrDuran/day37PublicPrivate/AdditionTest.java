package javaClassWithMrDuran.day37PublicPrivate;


public class AdditionTest {
    public static void main(String[] args) {
        Addition x = new Addition();
        x.additionsPublic(10,10);

        Addition.additionPublicStatic(10,10);
    }
}
