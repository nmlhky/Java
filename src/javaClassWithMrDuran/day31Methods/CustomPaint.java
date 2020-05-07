package javaClassWithMrDuran.day31Methods;

public class CustomPaint extends Paint {
    String paintGloss;
    String paintDurability;


    public CustomPaint(String colorName, double sqrFeet, double totalPrice, String paintGloss, String paintDurability) {
        super(colorName, sqrFeet, totalPrice);
        this.paintGloss = paintGloss;
        this.paintDurability = paintDurability;
    }

    public void setPaintGloss(String paintGloss) {
        this.paintGloss = paintGloss;
    }

    public void setPaintDurability(String paintDurability) {
        this.paintDurability = paintDurability;
    }

    public double FinalPriceCalculate(){
        double sum  = 0.0;
        if (this.paintGloss.contains("extra")){
            sum += 3;
        }else {sum +=2;}
        if (this.paintDurability.contains("extra")){
            sum += 3;
        }else {sum +=2;}

        sum += super.CalculatePrice();

        return sum;

    }
}
