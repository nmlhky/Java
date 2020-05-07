package javaClassWithMrDuran.day21_30.day27;

public class Encap {
    private int a;
    private int b;
    private int c;

    public Encap() {
        this.a = 10;
        this.b = 20;
        this.c = 30;
    }

    public Encap(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Encap{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
