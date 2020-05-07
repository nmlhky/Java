package javaClassWithMrDuran.day21_30.day23;

public class edge {
    public static void main(String[] args) {

        int[][] arr = {{0, 18, 238, 255, 248,}, {0, 87, 255, 255, 255}, {0, 75, 255, 255, 249}, {0, 39, 255, 255, 255}, {0, 67, 255, 255, 239}};
        int[] corner = new int[arr[0].length];

        for (int i = 0 ; i<arr.length ; i++){
            corner[i] = maxDif(arr[i]);
        }

        int a = maxDif(corner);

        System.out.println("edge is " + corner[a] + "," + a);

    }


    public static int maxDif (int[] a){
        int[] dif = new int[a.length-1];//create empty array for difference

        for (int i = 0 ; i<a.length-1 ; i++){
            dif[i] = Math.abs(a[i] - a[i+1]);//make a pozitive number
        }

        //finding maximum
        int maximum = dif[0];
        int index = 0;

        for (int i=1; i<dif.length; i++) {
            if (dif[i] > maximum) {
                maximum = dif[i];
                index = i;
            }
        }

        return index;
    }

}
