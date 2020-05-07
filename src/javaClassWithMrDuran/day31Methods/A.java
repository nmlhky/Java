package javaClassWithMrDuran.day31Methods;

public class A {
    private int a;
    int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public A(){
        this.a = 10;
        this.b = 20;
    }

    public int getA(){
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sumAB(){
        return a+b;
    }
}
