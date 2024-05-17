package interview_question;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        // initializing unsorted array
        Object[] arr = {10,2,33,22,69};

        // sorting array
        Arrays.sort(arr);

        // let us print all the elements available
        System.out.println("The sorted array is:");
        for (Object number : arr) {
            System.out.println("Number = " + number);
        }

        // entering the value to be searched
        int searchVal = 22;

        int retVal = Arrays.binarySearch(arr,searchVal);

        System.out.println("The index of element 22 is : " + retVal);
    }
}