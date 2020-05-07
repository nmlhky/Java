package javaClassWithMrDuran.day34Abstract;

public class Tiling extends Quete{
    private String material;
    private double materialPrice;

    public Tiling(String costumerName, int totalSquareFeet, int price, String material) {
        super(costumerName, totalSquareFeet, price);
        this.material = material;
        this.materialPrice = (material.equals("wood") ? 2.4 : 1.99 );
    }


    void calculatePrice(){
       super.price =  this.materialPrice * 4 * totalSquareFeet;
    }

    void printQuete(){
        System.out.println(super.costumerName + super.totalSquareFeet + super.price + this.material);
    }

}
