package Projects;

//  print
// char[][] arr = {{'X','X','X'},{'O','_','O'},{'O','_','_'}};

// control anybody win
// horizantal {{'x','X','X'},{'O','_','O'},{'O','_','_'}};
// vertical {{'X','_','X'},{'X','O','O'},{'X','O','O'}};
// cross  {{'O','_','X'},{'X','O','_'},{'X','O','O'}};


// print result
// x win
// y win

// assign value to array with scanner


//update
// if plan more than 3
// play full cell
// after x win end game
// restart button


import java.util.Scanner;

public class tictactoeFirstStep {

    static char[][] arr = new char[3][3];
    static int counterX;
    static int counterO;
    static boolean isXwin = false;
    static boolean isOwin = false;
    static boolean isGamefinish = false;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (!isGamefinish) {
            System.out.println("x turn");
            int n = scanner.nextInt();
            assignValueToArray('X', n);

            if (isGamefinish) break;
            System.out.println("o turn");
            n = scanner.nextInt();
            assignValueToArray('O', n);
        }
    }


    public static void assignValueToArray(char c, int i){


        if (i==99){
            arr = new char[3][3];
            String[] arr = new String[1];
            main(arr);
        }

        int x = i/10 ;
        int y = i%10 ;

        if (x > 3 || y >3){
            System.out.println("you can not play more than 3");
            String[] array = new String[1];
            main(array);
        }
        else if(arr[x-1][y-1] == 'X' || arr[x-1][y-1] == 'O'){
            System.out.println("this cell is full. Please play again");
            String[] array = new String[1];
            main(array);
        }
        else {
            arr[x-1][y-1] = c;

            print();
        }


    }

    public static void print() {
        //print part
        System.out.println("----------");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("|");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" |");
        }

        System.out.println("---------");

        control();
    }


    public static void control() {

        // control anybody win

        //Horizantal check


        for (int i = 0; i < arr.length; i++) {
            counterO = 0;
            counterX = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 'X') counterX++;
                if (arr[i][j] == 'O') counterO++;
            }

            if (counterO == 3) isOwin = true;
            if (counterX == 3) isXwin = true;
        }

        //vertical check

        for (int i = 0; i < arr.length; i++) {
            counterO = 0;
            counterX = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j][i] == 'X') counterX++;
                if (arr[j][i] == 'O') counterO++;
            }
            if (counterO == 3) isOwin = true;
            if (counterX == 3) isXwin = true;
        }

        //cross control
        if ((arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') || (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X'))
            isXwin = true;
        if ((arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') || (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O'))
            isOwin = true;

        printresult();

    }

    public static void printresult() {

        if (isOwin){
            isGamefinish= true;
            System.out.println("O won");
        }
        if (isXwin){
            isGamefinish = true;
            System.out.println("X win");
        }


    }

}
