public class LinearEquation {
    private int a = 1;
    private int b = 2;
    private int c = 3;
    private int d = 4;
    private int e = 5;
    private int f = 6;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public int getD(){
        return d;
    }
    public int getE(){
        return e;
    }
    public int getF(){
        return f;
    }

    public boolean isSolvable(){
        boolean flag;

        flag = ((a * d) - (b * c)) != 0;

        return flag;
    }

    public int getX(){
        int x = (e*d-b*f);
        int y = (a*d-b*c);
        System.out.println(x);
        System.out.println(y);
        int xx =  x / y;
        return xx;
    }



    public static void main(String[] args) {
        LinearEquation linearEquation= new LinearEquation(2,3,4,5,6,7);
        System.out.println(linearEquation.getA());



    }

}