package javaClassWithMrDuran.day21_30.day30;

public class StatArray extends ArrayOps {
    private int[] array;
    private int length;

    public StatArray(int[] array) {
        this.array = array;
        this.length = array.length;
    }

    double Average (){
        int  sum =  0;
        for (int i = 0; i < length ; i++) {
            sum += this.array[i];
        }
        return sum / length;
    }

    int MinValue(){
        int min = this.array[0];

        for (int i = 0; i < length ; i++) {
            if (array[i] < min)
                min = array[i];
        }

        return min;
    }

    int MaxValue(){
        int max = this.array[0];

        for (int i = 0; i < length ; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }
}
