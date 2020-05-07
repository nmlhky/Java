package javaClassWithMrDuran.day52Enum;

public enum Colors {
    MAROON(155,200,180),
    TEAL(10,230,50),
    GREEN(0,255,0),
    BLUE(0,0,255);

    private int red;
    private int green;
    private int blue;

    Colors(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
}
