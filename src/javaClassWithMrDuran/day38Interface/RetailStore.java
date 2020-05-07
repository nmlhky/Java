package javaClassWithMrDuran.day38Interface;

public class RetailStore {
    String[] product;
    static int totalInventoryQuantities;
    int inventoryQuantity;

    public RetailStore(String[] product, int inventoryQuantity) {
        this.product = product;
        this.inventoryQuantity = inventoryQuantity;
        totalInventoryQuantities += this.inventoryQuantity * this.product.length;
    }

    public void receive() {
        this.inventoryQuantity++;
    }

    public void sell() {
        this.inventoryQuantity--;
    }

    public void getInventoryQuantity() {
        System.out.println(inventoryQuantity);
    }

    public static int getTotalInventoryQuantities() {
        return totalInventoryQuantities;
    }
}