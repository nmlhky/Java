package javaClassWithMrDuran.day35Interfaces;

public class WorkStation extends Computer implements Computers {
    protected String housingType;
    protected int screenSize;

    public WorkStation(String mainBoardSpec, int memorySize, int cpuSpeed, String cpuType, String housingType, int screenSize) {
        super(mainBoardSpec, memorySize, cpuSpeed, cpuType);
        this.housingType = housingType;
        this.screenSize = screenSize;
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

    public void connectToNetwork(){
        /* connect network */
    }
}
