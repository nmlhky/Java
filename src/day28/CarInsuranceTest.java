package day28;

public class CarInsuranceTest {
    public static void main(String[] args) {
        CarInsurance myCar = new CarInsurance(2002,2,0,0,50);

        System.out.println(myCar.makeOffer());
    }
}
