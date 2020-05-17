package questionsAnswers;

public class carpimTablosu {
    public static void main(String[] args) {

        System.out.print("\t\t");

        for (int i = 1; i < 11; i++) {
            System.out.print(i+"\t");
        }

        System.out.println("\n\t--------------------------------------");

        for (int i = 1; i < 11; i++) {
            System.out.print(i + "\t|\t");
            for (int j = 1; j < 11; j++) {
                System.out.print(i*j +"\t");
            }
            System.out.println();
        }
    }


}
