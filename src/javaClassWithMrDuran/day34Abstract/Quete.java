package javaClassWithMrDuran.day34Abstract;

abstract class Quete {
    protected String costumerName;
    protected int totalSquareFeet;
    protected double price;

    public Quete(String costumerName, int totalSquareFeet, int price) {
        this.costumerName = costumerName;
        this.totalSquareFeet = totalSquareFeet;
        this.price = price;
    }

    abstract void calculatePrice();
    abstract void printQuete();
}
