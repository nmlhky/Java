package javaClassWithMrDuran.day35Interfaces;

public class DiceBias implements Dices{
    private int numberOfFaces;
    private int biosFactor;

    public DiceBias(int numberOfFaces, int biosFactor) {
        this.numberOfFaces = numberOfFaces;
        this.biosFactor = biosFactor;
    }

    public void roll(){
        System.out.println((int)(Math.random()*numberOfFaces) +1 );
    }

    public void rollTwice(){
        this.roll();
        this.roll();
    }

    public void rollTriple(){
        this.roll();
        this.roll();
        this.roll();
    }

    int BiasesRoll(){
        return (int)(Math.random() * (faces+1-biosFactor) + biosFactor );
    }

}
