package calculator.Four_Function;
import java.util.Scanner;

import calculator.Main;
import calculator.Core_Logic.Fractions;
import calculator.misc.Rudeness;
import calculator.misc.Errors.FatalMainException;

public class Multiplication {
    public static void main(String[] args) throws FatalMainException {
        Rudeness rude = new Rudeness();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to multiplication!");

        // Fraction Check
        System.out.println("Would you like to multiply fractions? (y/n)");
        String userFrac = sc.nextLine();

        if (userFrac.equalsIgnoreCase("y")) {
            var frac = Fractions.Fraction(sc);
            var frac2 = Fractions.Fraction(sc);

            System.out.println("Answer: " + frac.multiply(frac2));

            System.out.print("Return to Menu? (y/n)>");
            String userMenu = sc.nextLine();

        if (userMenu.equalsIgnoreCase("y")) {
            Main.main(args);
        } if (userMenu.equalsIgnoreCase("n")) {
            System.out.println("Goodbye!");
        }
            //System.exit(0);
        } if (userFrac.equalsIgnoreCase("n")) {
            System.out.println("Continuing on with standard multiplication...");
        }

        int firstNumber = 0;
        int secondNumber = 0;

        while (true) {
            try {
                System.out.println("Give first number");
                firstNumber = sc.nextInt();
                break;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(rude.RandomInsult());
            }
        }

        while (true) {
            try {
                System.out.println("Give second number"); 
                secondNumber = sc.nextInt();
                break;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(rude.RandomInsult());
            }
        }

        // Answer
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));

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
