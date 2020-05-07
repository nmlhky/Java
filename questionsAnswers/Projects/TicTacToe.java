package Projects;

import java.util.Scanner;

public class TicTacToe {

    static char[][] arr = new char[3][3];
    static boolean isXWin = false;
    static boolean isOWin = false;
    static boolean isGameFinish = false;
    static int numberOfX = 0;
    static int numberOfO = 0;
    static int numberOfTurn = 0;


    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {

        Scanner scanner = new Scanner(System.in);

        while (!isGameFinish) {
            if (numberOfX <= numberOfO) {
                System.out.println("x turn");
                int n = scanner.nextInt();
                saveToArray('X', n);
            } else { if (isGameFinish) break;
                System.out.println("O turn ");
                int n = scanner.nextInt();
                saveToArray('O', n);
            }
        }
    }

    public static void saveToArray (char c , int n){

        if (n==99){
            numberOfX = 0;
            numberOfO = 0;
            numberOfTurn = 0;
            arr = new char[3][3];
            startGame();
        }

        int x = n / 10 ;
        int y = n % 10 ;


        if (x>3 || y > 3){
            System.out.println("number has to be smaller than 3 . Please play again");
        }
        else if (arr[x-1][y-1]=='X' || arr[x-1][y-1]=='O'){
            System.out.println("this cell is full. Please play again");
        }
        else {
            arr[x - 1][y - 1] = c;
            if (c=='X') numberOfX++;
            if (c=='O') numberOfO++;
            numberOfTurn++;
        }
        print();
    }



    public static void print() {
        System.out.println("-----------");

        for (char[] cc : arr) {
            System.out.print("|");
            for (char c : cc) {
                System.out.print(" " + c + " ");
            }
            System.out.println("|");
        }

        System.out.println("-----------");

        control();
    }



    public static void control () {

        //horizon and vertical control
        for (int i = 0; i < 3; i++) {
            int xh = 0, yh = 0 , xv = 0, yv = 0 ;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 'X') xh++;
                if (arr[i][j] == 'O') yh++;
                if (arr[j][i] == 'X') xv++;
                if (arr[j][i] == 'O') yv++;
            }
            if (xh == 3 || xv == 3) isXWin = true;
            if (yh == 3 || yv == 3) isOWin = true;
        }

        //cross control

        if ((arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') || (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X')) isXWin = true;
        if ((arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') || (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O')) isOWin = true;

        result();
    }

    public static void result(){

        if (isXWin){
            System.out.println("X won");
            isGameFinish = true;
        }
        if (isOWin){
            System.out.println("O won");
            isGameFinish = true;
        }
        if (numberOfTurn >= 9){
            System.out.println("nobody could win");
            isGameFinish = true;
        }

    }

}


