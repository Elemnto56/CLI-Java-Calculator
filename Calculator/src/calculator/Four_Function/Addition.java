package calculator.Four_Function;
import java.util.Scanner;
import calculator.misc.Rudeness;
import calculator.*;

public class Addition {
    public static void main(String[] args) {
        Rudeness insult = new Rudeness();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Addition!");
        
        int userOne = 0;
        int userTwo = 0;

        // Bool for user inputs if it's truly an int
        boolean gotFirstNumber = false;
        boolean gotSecondNumber = false;

        // Loop until bool is true
        while (!gotFirstNumber) {
            // Exception
            try {
                // First number
                System.out.println("Give first number");
                userOne = sc.nextInt();
                gotFirstNumber = true;
            } catch (Exception e) {
                sc.nextLine(); // Open new line incase failed
                System.out.println(insult.RandomInsult());
            }
        }

        // Loop until bool true
        while (!gotSecondNumber) {
            // Catch for letter and not input
            try {
                // Second number
                System.out.println("Give second number");
                userTwo = sc.nextInt();
                gotSecondNumber = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(insult.RandomInsult());
            }
        }

        // Answer
        System.out.println(userOne + " + " + userTwo + " = " + (userOne + userTwo));
        sc.nextLine();
        
        System.out.print("Return to Menu? (y/n)>");
        String userMenu = sc.nextLine();

        if (userMenu.equalsIgnoreCase("y")) {
            Main.main(args);
        } if (userMenu.equalsIgnoreCase("n")) {
            System.out.println("Goodbye!");
        }

        sc.close();
    }
}