package CodeSignal;

public class Diamond {
    public static void main(String[] args) {
        int n =5;

        int shapeArea = 0;

        for (int i = 0 ; i<n; i++){
            if (i==n-1) {
                shapeArea = shapeArea + i * 2 + 1;
            }else {
                shapeArea = shapeArea + 2*(i * 2 + 1);
            }

        }

    }

}
