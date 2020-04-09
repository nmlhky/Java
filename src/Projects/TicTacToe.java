package Projects;

import java.util.Scanner;

public class TicTacToe {

    static boolean isXWin = false;
    static boolean isOWin = false;
    static int numberOfX = 0;
    static int numberOfO = 0;
    static char[][] arr = new char[3][3];
    static boolean isGameFinish = false;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (!isGameFinish) {
            System.out.print("x turn");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            enter('X', x, y);

            if (isGameFinish) break;
            System.out.print("O turn");
            x = scanner.nextInt();
            y = scanner.nextInt();

            enter('O', x, y);
        }


    }

    public static void enter (char c , int x , int y){
        if (arr[x-1][y-1]=='X' || arr[x-1][y-1]=='O'){
            System.out.println("this cell is full, play another cell");
        }
        else {
            arr[x - 1][y - 1] = c;
            print();
        }
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

        //horizon control
        for (int i = 0; i < 3; i++) {
            int x = 0, y = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 'X') {
                    x++;
                    numberOfX++;
                }
                if (arr[i][j] == 'O') {
                    y++;
                    numberOfO++;
                }
            }
            if (x == 3) isXWin = true;
            if (y == 3) isOWin = true;
        }
        //vertical control
        for (int i = 0; i < 3; i++) {
            int x = 0, y = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[j][i] == 'X') x++;
                if (arr[j][i] == 'O') y++;
            }
            if (x == 3) isXWin = true;
            if (y == 3) isOWin = true;
        }
        //cross control

        if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') isXWin = true;
        if (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') isXWin = true;

        if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') isOWin = true;
        if (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') isOWin = true;

        result();
    }

    public static void result(){

//        if ( (isOWin && isXWin) || (numberOfO != numberOfX) ){
//            System.out.println("Impossible");
//        }
         if (isXWin){
            System.out.println("X wins");
            isGameFinish = true;
        }
        if (isOWin){
            System.out.println("O wins");
            isGameFinish = true;
        }
//        else if (enter.contains("_")){
//            System.out.println("Game not finished");
//        }
//        else {
//            System.out.println("Draw");
//        }

    }


}


