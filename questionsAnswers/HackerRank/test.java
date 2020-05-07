package HackerRank;

public class test {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int counter = 1;
        for(int i = 0 ; i <3 ; i++){
            for (int j = 0 ; j<3 ; j++){
                arr[i][j] = counter;
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
