package javaClassWithMrDuran.day35Interfaces;

public class Computer implements Computers {
    protected String mainBoardSpec;
    protected int memorySize;
    protected int cpuSpeed;
    protected String cpuType;

    public Computer() {

    }

    public Computer(String mainBoardSpec, int memorySize, int cpuSpeed, String cpuType) {
        this.mainBoardSpec = mainBoardSpec;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        this.cpuType = cpuType;
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

    public void turnOn() {
        /* turn on */
    }

    public void turnOff() {
        /* turn off */
    }

    public void boot() {
        /* boot */
    }

    public void print(){
        System.out.println("computer");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mainBoardSpec='" + mainBoardSpec + '\'' +
                ", memorySize=" + memorySize +
                ", cpuSpeed=" + cpuSpeed +
                ", cpuType='" + cpuType + '\'' +
                '}';
    }
}