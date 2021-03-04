package Projects;

import java.util.Random;

public class Sudoku {


    public static int[][] board = new int[9][9];


    public static int[][] board2 = {
            {9,0,0,1,0,0,0,0,5},
            {0,0,5,0,9,0,2,0,1},
            {8,0,0,0,4,0,0,0,0},
            {0,0,0,0,8,0,0,0,0},
            {0,0,0,7,0,0,0,0,0},
            {0,0,0,0,2,6,0,0,9},
            {2,0,0,3,0,0,0,0,6},
            {0,0,0,2,0,0,9,0,0},
            {0,0,1,9,0,4,5,7,0},
    };



    public static void main(String[] args) {

        random_gen(9);
        print();

    }

    public static void generate() {
        int k, n=1;
        for(int i=0;i<9;i++)
        {
            k=n;
            for(int j=0;j<9;j++)
            {
                if(k<=9){
                    board[i][j]=k;
                    k++;
                }else{
                    k=1;
                    board[i][j]=k;
                    k++;
                }
            }
            n=k+3;
            if(k==10)
                n=4;
            if(n>9)
                n=(n%9)+1;
        }
    }

    public static void random_gen(int check){
        int k1,k2,max=2,min=0;
        Random r= new Random();
        for(int i=0;i<3;i++)
        {
//There are three groups.So we are using for loop three times.
            k1=r.nextInt(max-min+1)+min;
//This while is just to ensure k1 is not equal to k2.
            do{
                k2=r.nextInt(max-min+1)+min;
            }while(k1==k2);
            max+=3;min+=3;
//check is global variable.
//We are calling random_gen two time from the main func.
//Once it will be called for columns and once for rows.
            if(check==1)
//calling a function to interchange the selected rows.
                permutation_row(k1,k2);
            else if(check==0)
                permutation_col(k1,k2);
        }
    }

    //For row
    public static void permutation_row(int k1,int k2){
        int temp;//k1 and k2 are two rows that we are selecting to interchange.
        for(int j=0;j<9;j++)
        {
            temp=board[k1][j];
            board[k1][j]=board[k2][j];
            board[k2][j]=temp;
        }
    }


    public static void permutation_col(int k1,int k2){
        int temp;
        for(int j=0;j<9;j++)
        {
            temp=board[j][k1];
            board[j][k1]=board[j][k2];
            board[j][k2]=temp;
        }
    }



    public static void fill(){
        int row = 0;
        int col ;
        while (row < 9){
            col = 0;

            while (col < 9){

                int rnd  = random();
                System.out.println(row + " " + col + " " +rnd);
                if (isOk(row,col,rnd)) {
                    board[row][col] = rnd;
                    col++;
                }

            }
            row++;
        }

    }



    // combined method to check if a number possible to a row,col position is ok
    public static boolean isOk(int row, int col, int number) {
        return isInRow(row, number) && isInCol(col, number) && isInBox(row, col, number);
    }

    // we check if a possible number is already in a row
    public static boolean isInRow(int row, int number) {
        for (int i = 0; i < 9; i++)
            if (board[row][i] == number)
                return false;

        return true;
    }

    // we check if a possible number is already in a column
    public static boolean isInCol(int col, int number) {
        for (int i = 0; i < 9; i++)
            if (board[i][col] == number)
                return false;

        return true;
    }

    // we check if a possible number is in its 3x3 box
    public static boolean isInBox(int row, int col, int number) {
        int r = row - row % 3;
        int c = col - col % 3;

        for (int i = r; i < r + 3; i++)
            for (int j = c; j < c + 3; j++)
                if (board[i][j] == number)
                    return false;

        return true;
    }

    public static void print(){
        System.out.println("-------------------------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j%3 == 0) System.out.print("| ");
                System.out.print(board[i][j]+" ");

            }
            System.out.println("|");
            if (i%3==2) System.out.println("-------------------------");
        }

    }

    public static int random(){
        return (int)(Math.random()*9 +1);
    }

}
