package javaClassWithMrDuran.day32_34Methods;

public class CarInsurance {
    private int modelYear;
    private int numberOfTickets;
    private int numberOfAccidents;
    private int offer;
    final int basePrice = 100;

    public CarInsurance(int modelYear, int numberOfTickets, int numberOfAccidents) {
        this.modelYear = modelYear;
        this.numberOfTickets = numberOfTickets;
        this.numberOfAccidents = numberOfAccidents;
        this.offer = 0;
    }

    public int makeOffer(){
        return this.basePrice + (2020 - this.modelYear) * 50 + (30 * this.numberOfTickets)+ (100*this.numberOfAccidents);
    }

    @Override
    public String toString() {
        return "CarInsurance{" +
                "modelYear=" + modelYear +
                ", numberOfTickets=" + numberOfTickets +
                ", numberOfAccidents=" + numberOfAccidents +
                ", priceOffer=" + offer +
                ", basePrice=" + basePrice +
                '}';
    }
}
