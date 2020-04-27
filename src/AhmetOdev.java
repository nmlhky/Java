
import java.util.Random;
import java.util.Scanner;

public class AhmetOdev {
    static Scanner Scanner = new Scanner(System.in);
    static Random random  = new Random();
    static String[] locations = {"Montreal", "Mexico City", "Paris", "Oslo", "Kathmandu", "Arizona", "New Delhi",
            "New York", "Cairo", "Sidney", "Beijing", "Lima", "London"};
    static String places = "Hudson Bay, A Secret Remedy for Montezuma’s Revenge, The Elevator from the Eiffel Tower, Harald the Fairhaired’s Shampoo, The Abominable Snowman, The Grand Canyon, Gandhi’s Glasses, The Statue of Liberty’s Torch, The Plans for the Great Pyramid, The Chandelier from the Opera House, All the Tea in China, Pizarro’s Sword, The Crown Jewels";
    static String[] loots = places.split(", ");

    static int warrant ;
    static int correctAnswer = 0 ;
    static int score = 0;
    static int round = 1 ;

    public static void main(String[] args) {

        System.out.println("Welcome, gumshoe, to Acme Detective agency.\n");
        System.out.println("Today's caper is brought to you by the First Year Experience and programers like you.\n");
        System.out.print("Please tell us your name: ");
        String name = Scanner.nextLine();

        System.out.println("Welcome Professor " + name + ". Can you help us find where in the world Carmen Sandiego is?");

        yesNo();
    }

    public static void yesNo(){
        System.out.println("1. Yes\n2. No");
        System.out.print("Please enter your choice:  ");
        int number = Scanner.nextInt();

        if (number == 1) {
            mainCase();
        } else if (number == 2) {
            System.out.println("See you on the next case, gumshoe.");
        } else {
            System.out.println("Please select valid menu choice: ");
            yesNo();
        }
    }


    public static void printWarrant(){
        for (int i = 0; i < loots.length; i++) {
            System.out.println( (i+1)+ ". " +loots[i]);
        }

        int stolenLoot = random.nextInt(13);

        System.out.println("Enter your warrant:  ");
        warrant = Scanner.nextInt();

        if (warrant == stolenLoot) {
            System.out.println("Good job gumshoe, you got the loot but Carmen escaped. Follow her to the next city");
            if (round==1) score += 25;
            else score += 10;
            correctAnswer++;
        }
        else {
            System.out.println("Nice try gumshoe, better luck in the next city");
        }


        System.out.println("cities Visited : " + round + " Round won : " + correctAnswer + " Score : " + score);

        round++;
    }

    public static void mainCase(){


        while (correctAnswer < 3 && round < 6){
            int rnd = random.nextInt(13);
            System.out.println("\nRound " + round);

            System.out.println("You are in "+locations[rnd]);

            System.out.println("What would you like to do now:");
            System.out.println("1. Continue to the next locations.");
            System.out.println("2. Issue a warrant (Tell us what Carmen Has Stolen).");
            System.out.print("\nPlease enter your choice:  ");

            int numberRound = Scanner.nextInt();

            if (numberRound == 1) {
                round++;
            } else if (numberRound == 2) {
                printWarrant();
            } else {
                System.out.println("Please select valid menu choice: ");
            }

        }

        if (correctAnswer == 3) System.out.println("YOU WON");
        else System.out.println("NICE TRY");



    }
}