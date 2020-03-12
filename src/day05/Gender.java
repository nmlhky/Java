package day05;
import java.util.Scanner;
public class Gender {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char gender = scan.next().charAt(0);

        if(gender == 'm'){
            System.out.println("Male");
        }else if(gender == 'f'){
            System.out.println("Female");
        }else{
            System.out.println("Wrong answer enter m or f");
        }
    }
}
