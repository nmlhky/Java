package Ahmet;

public class TopSecret {
    double coordinateX;
    double coordinateY;
    int NumberOfMic;

    public TopSecret(double coordinateX, double coordinateY, int numberOfMic) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.NumberOfMic = numberOfMic;
    }

    public TopSecret() {
        this.coordinateX = Math.random()*100;
        this.coordinateY = Math.random()*100;
        this.NumberOfMic = (int)(Math.random()*11);
    }

    public void DropMic() {
        if (this.NumberOfMic != 0){
            NumberOfMic--;
            this.coordinateX = Math.random()*100;
            this.coordinateY = Math.random()*100;
        }
        else {
            System.out.println("Your Spy turtle is dead");
        }

    }

    @Override
    public String toString() {
        return "TopSecret{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", NumberOfMic=" + NumberOfMic +
                '}';
    }
}
