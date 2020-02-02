package SecondDay;
import java.util.Scanner;

public class scanstring {

    public static void main(String[] args) {
        Scanner keyboard =  new Scanner(System.in);
        System.out.println("your name");
        String name = keyboard.nextLine();
        System.out.println("your name is :" +  name);
    }
}
