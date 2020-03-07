package day20;

public class test {
    public static void main(String[] args) {
        int[][] x = {{0,1,2},{7,0,3},{6,5,4}};

        int c = 0;

        for (int i =0 ; i <3 ;  i++){
            for (int j =0 ; j <3 ;  j++){
                if (i == 1 && j== 1 ) {
                    System.out.print("---");
                    continue;
                }
                if (j==1 || j ==0)
                    System.out.print(x[i][j] +"--");
                if (j==2)
                    System.out.println(x[i][j]);
            }

        }
    }
}
