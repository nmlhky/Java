package javaClassWithMrDuran.day21_30.day30;

public class RoadBike extends Bicycle {
    protected int tireSize;
    protected int handleBar;

    public RoadBike(int gear, int speed, int tireSize, int handleBar) {
        super(gear, speed);
        this.tireSize = tireSize;
        this.handleBar = handleBar;
    }
}