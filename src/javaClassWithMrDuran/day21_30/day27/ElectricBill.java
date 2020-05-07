package javaClassWithMrDuran.day21_30.day27;

public class ElectricBill {
        private int memberId;
        private int counter;
        private String name;
        private double billAmount;

    public ElectricBill(int memberId, int counter, String name, double billAmount) {
        this.memberId = memberId;
        this.counter = counter;
        this.name = name;
        this.billAmount = billAmount;
    }

    public double displayBill(){
        this.billAmount = this.counter * 1.9;
        return this.billAmount;
    }

    public int readCounter(){
        return counter;
    }

    public void addComsumption(int consumption){
        this.counter += consumption;
    }

    @Override
    public String toString() {
        return "ElectricBill{" +
                "memberId=" + memberId +
                ", counter=" + counter +
                ", name='" + name + '\'' +
                ", billAmount=" + billAmount +
                '}';
    }


}
