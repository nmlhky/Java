package javaClassWithMrDuran.day38Interface;

import static javaClassWithMrDuran.day38Interface.RetailStore.*;

public class RetailStoreTest {
    public static void main(String[] args) {
        String[] arr = {"pen", "pencil"};
        RetailStore store1 = new RetailStore(arr, 10);

        String[] arr2 = {"book", "notebook"};
        RetailStore store2 = new RetailStore(arr2, 100);

        System.out.println(getTotalInventoryQuantities());
    }
}
