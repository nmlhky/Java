package Homework;
import java.util.Scanner;
public class store {
    public static void main(String[] args) {
        String[] ItemName = {"Strawberry", "Blueberry", "pineapple", "Watermelon", "Pomegranate" };
        float[] ItemPrice = {2.5f, 1.5f, 3.5f, 4f, 2};

        Scanner scan = new Scanner(System.in);
        System.out.println("first product id (1 to 5):");
        int id1= scan.nextInt();
        System.out.println(ItemName[id1-1]+" quantity:");
        int qua1 = scan.nextInt();

        System.out.println("Second product id (1 to 5):");
        int id2= scan.nextInt();
        System.out.println(ItemName[id2-1]+" quantity:");
        int qua2 = scan.nextInt();


        System.out.println("Third product id (1 to 5):");
        int id3= scan.nextInt();
        System.out.println(ItemName[id3-1]+" quantity:");
        int qua3 = scan.nextInt();

        System.out.println("Fruit Name \t\tPrice\t\tquantity\tTotal Price" );
        System.out.println("---------------------------------------------------");
        System.out.println(ItemName[id1-1]+"\t\t$"+ItemPrice[id1-1]+"\t\t"+qua1+"\t\t\t$"+ItemPrice[id1-1]*qua1);
        System.out.println(ItemName[id2-1]+"\t\t$"+ItemPrice[id2-1]+"\t\t"+qua2+"\t\t\t$"+ItemPrice[id2-1]*qua2);
        System.out.println(ItemName[id3-1]+"\t\t$"+ItemPrice[id3-1]+"\t\t"+qua3+"\t\t\t$"+ItemPrice[id3-1]*qua3);
        System.out.println("---------------------------------------------------");

        System.out.println("TOTAL PRICE = $"+ (ItemPrice[id1-1]*qua1 + ItemPrice[id2-1]*qua2 + ItemPrice[id3-1]*qua3));

    }
}
