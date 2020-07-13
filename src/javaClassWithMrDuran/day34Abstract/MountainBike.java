package javaClassWithMrDuran.day34Abstract;

public class MountainBike extends Bicycle{
    private int speed;
    private boolean startStop;
    private int tireSize;
    private int seatHeight;

    public MountainBike() {
        super();
        this.speed = 10;
        this.startStop = true;

    }

    public MountainBike(int speed, boolean startStop, int tireSize, int seatHeight) {
        super();
        this.speed = speed;
        this.startStop = startStop;
        this.tireSize = tireSize;
        this.seatHeight = seatHeight;
    }

    void switchToSteepMode(){
        /* do something */
    }
    void speedUp(){
        speed++;
    }
    void slowDown(){
        speed--;
    }
    void stop(){
        startStop = false;
    }
    void start(){
        startStop = true;
    }


    @Override
    public String toString() {
        return "MountainBike{" +
                "speed=" + speed +
                ", startStop=" + startStop +
                ", tireSize=" + tireSize +
                ", seatHeight=" + seatHeight +
                '}';
    }
}