
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();

        double d = scan.nextDouble();

        scan.nextLine(); // Consume newline left-over // if i didnt put this line, it didnt ask string input

        String s = scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

