package Projects;

import java.util.*;

public class Tictac {
    static char[][] arr = new char[3][3];

    public static void main(String[] args) {

        // scanner part
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.next();
        scanner.close();

        //create array
        int counter = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = enter.charAt(counter);
                counter++;
            }
        }
        print();
    }

    public static void print(){
        //print part
        System.out.println("---------");

        for (char[] cc : arr) {
            System.out.print("|");
            for (char c :  cc ) {
                System.out.print(" ");
                if (c != '_') System.out.print(c);
            }
            System.out.println(" |");
        }

        System.out.println("---------");

        control();
    }

    public static void control(){

        //control part

        int numberOfX = 0;
        int numberOfO = 0;
        boolean isXWin = false;
        boolean isOWin = false;
        int playingTime = 0;

        //horizon control
        for (int i = 0; i < 3; i++) {
            int x = 0 , y = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j]=='X'){
                    x++;
                    numberOfX++;
                    playingTime++;
                }
                if (arr[i][j]=='O'){
                    y++;
                    numberOfO++;
                    playingTime++;
                }
            }
            if (x==3) isXWin = true;
            if (y==3) isOWin = true;
        }
        //vertical control
        for (int i = 0; i < 3; i++) {
            int x = 0 , y = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[j][i]=='X') x++;
                if (arr[j][i]=='O') y++;
            }
            if (x==3) isXWin = true;
            if (y==3) isOWin = true;
        }
        //cross control

        if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X' ) isXWin = true;
        if (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X' ) isXWin = true;

        if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O' ) isOWin = true;
        if (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O' ) isOWin = true;

        //print part

        if(isOWin && isXWin){
            System.out.println("Impossible");
        }
        else if (isXWin){
            System.out.println("X wins");
        }
        else if (isOWin){
            System.out.println("O wins");
        }
        else if (playingTime==9){
            System.out.println("Draw");
        }
        else if (numberOfO != numberOfX) {
            System.out.println("Impossible");
        }
        else {
            System.out.println("Game not finished");
        }

    }

}

