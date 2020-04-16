import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int largest = 0;

        while (counter < 3) {

            System.out.println("Enter the number: ");
            int number = scanner.nextInt();

            if (largest < number) {
                largest = number;
            }
            counter++;

        }
        System.out.println("the largest number is " + largest);
    }
}
