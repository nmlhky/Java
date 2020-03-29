package day35Interfaces;

public class Laptop implements Computers {
    protected  String mainBoardSpec;
    protected int memorySize;
    protected int cpuSpeed;
    protected String cpuType;
    protected int batteryPercentage;

    public Laptop(String mainBoardSpec, int memorySize, int cpuSpeed, String cpuType, int batteryPercentage) {
        this.mainBoardSpec = mainBoardSpec;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        this.cpuType = cpuType;
        this.batteryPercentage = batteryPercentage;
    }

    public void ChargeBattery() {
        batteryPercentage++;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setMainBoard() {
        /* Set Mainboard */
    }

    public void InstallCPU() {
       /* Install CPU */
    }

    public void InstallMemory() {
        /* Install Memory */
    }

}