package javaClassWithMrDuran.day11_20.day16;

public class RandomFood {
    public static void main(String[] args) {
        for (int i=0;i<50;i++)
        pickMeFood();
    }

    public static void pickMeFood(){
        int number = (int)((Math.random()*3)+1);
        if(number==1){
            System.out.println("soup");
        }else if(number==2){
            System.out.println("hamburger");
        }else if(number==3){
            System.out.println("salad");
        }
    }
}
