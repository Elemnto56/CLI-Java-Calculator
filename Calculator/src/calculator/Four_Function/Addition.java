package calculator.Four_Function;
import java.util.Scanner;
import calculator.*;
import calculator.Core_Logic.Fractions;
import calculator.misc.Rudeness;
import calculator.misc.Errors.FatalMainException;

public class Addition {
    public static void main(String[] args) throws FatalMainException {
        Rudeness insult = new Rudeness();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Addition!");

        // Fraction check
        System.out.println("Would you like add fractions? (y/n)");
        String userFrac = sc.nextLine();

        if (userFrac.equalsIgnoreCase("y")) {
            Fractions.FracAddition();

            System.out.print("Return to Menu? (y/n)>");
        String userMenu = sc.nextLine();

        if (userMenu.equalsIgnoreCase("y")) {
            Main.main(args);
        } if (userMenu.equalsIgnoreCase("n")) {
            System.out.println("Goodbye!");
        }
        } if (userFrac.equalsIgnoreCase("n")) {
            System.out.println("Continuing on with standard additon...");
        }
        
        int userOne = 0;
        int userTwo = 0;

        // Loop until bool is true
        while (true) {
            // Exception
            try {
                System.out.println("Give first number");
                userOne = sc.nextInt();
                break;
            } catch (Exception e) {
                sc.nextLine();

           }
        }

     while (true) {
            // Catch for letter and not input
            try {
                // Second number
                System.out.println("Give second number");
                userTwo = sc.nextInt();
                break;
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