package javaClassWithMrDuran.day52Enum;

enum Levels{
    TOP,MEDIUM (10), BOTTOM (20,30);
    int  i ,j ;
    private Levels(){

    }

    Levels(int i) {
        this.i = i;
    }

    Levels(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

public class MainClass {
    public static void main(String[] args) {
        System.out.println(Levels.TOP.i);
        System.out.println(Levels.TOP.j);
        System.out.println(Levels.MEDIUM.i);
        System.out.println(Levels.MEDIUM.j);
        System.out.println(Levels.TOP.i);
        System.out.println(Levels.TOP.i);

    }
}
