package javaClassWithMrDuran.day21_30.day30;

public class ArrayOps {
    protected int indexInt;
    protected int indexString;

    public ArrayOps() {
        this.indexInt = -1;
        this.indexString = -1;
    }

    public int IndexOfIntArray (int[] array , int number){
        for (int i = 0; i < array.length ; i++) {
            if (array[i]== number) {
                this.indexInt = i;
                return this.indexInt;
            }
        }
        return this.indexInt;
    }


    public int IndexOfStringArray (String[] array , String word){
        for (int i = 0; i < array.length ; i++) {
            if (array[i].equals(word) ){
                this.indexString = i;
            return this.indexString;
            }
        }
            return this.indexString;
    }


}