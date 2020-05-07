package javaClassWithMrDuran.day21_30.day26;

public class DesignAShapes {
    char symbol;
    int width , height;

    public DesignAShapes(){
        this.symbol= '*';
        this.width = 10;
        this.height= 10;
    }
    public DesignAShapes(char symbol , int width , int height){
        this.symbol= symbol;
        this.width = width;
        this.height= height;
    }

    void printPyramid (){
        for (int i = 0 ; i < this.height ; i++) {
            for (int k = i; k < width; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(this.symbol+" ");
            }
            System.out.println();
        }
    }

    void printRectangle (){
        for (int i = 0 ; i < this.height ; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(this.symbol+" ");
            }
            System.out.println();
        }
    }
}
