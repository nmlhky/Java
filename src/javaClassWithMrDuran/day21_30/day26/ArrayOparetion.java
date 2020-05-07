package javaClassWithMrDuran.day21_30.day26;


public class ArrayOparetion {
   int size;
   int[] arr ;

   public ArrayOparetion(int[] a){
       this.size = a.length;
       this.arr = a;
   }

   void printOdd (){
       for (int i = 0 ; i<size ; i++)
           if (arr[i] % 2 != 0)
               System.out.println(arr[i]);
   }

    void printEven () {
        for (int i = 0; i < size; i++)
            if (arr[i] % 2 == 0)
                System.out.println(arr[i]);
    }

    void printLargest (){
       int largest = arr[0];

        for (int i = 0 ; i<size ; i++)
            if (arr[i] > largest  )
                largest = arr[i] ;

        System.out.println(largest);
    }

    void printSmallest (){
        int smallest = arr[0];

        for (int i = 0 ; i<size ; i++)
            if (arr[i] < smallest  )
                smallest = arr[i] ;

        System.out.println(smallest);
    }

}