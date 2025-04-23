package calculator.Four_Function;
import java.util.Scanner;
import org.apache.commons.math3.fraction.Fraction;

import calculator.Main;
import calculator.Core_Logic.Fractions;
import calculator.misc.Rudeness;
import calculator.misc.Errors.FatalMainException;
import calculator.misc.*;;

public class Division {
    public static void main(String[] args) throws FatalMainException {
        Rudeness insult = new Rudeness();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to division!");

        // Fraction check
        System.out.println("Would you like divide fractions? (y/n)");
        String userFrac = sc.nextLine();

        if (userFrac.equalsIgnoreCase("y")) {
            var frac = Fractions.Fraction(sc);
            var frac2 = Fractions.Fraction(sc);

            System.out.println("Answer: " + frac.divide(frac2));

            System.out.print("Return to Menu? (y/n)>");
            String userMenu = sc.nextLine();

        if (userMenu.equalsIgnoreCase("y")) {
            Main.main(args);
        } if (userMenu.equalsIgnoreCase("n")) {
            System.out.println("Goodbye!");
        }
            //System.exit(0);
        } if (userFrac.equalsIgnoreCase("n")) {
            System.out.println("Continuing on with standard divison...");
        }

        int userOne = 0;
        int userTwo = 0;
        
        while (true) {
            try {
                System.out.println("Type in first number: ");
                userOne = sc.nextInt();
                break;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(insult.RandomInsult());
            }
        }

        while (true) {
            try {
                System.out.println("Type second number: ");
                userTwo = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(insult.RandomInsult());
            }
        }

        // Answer
            System.out.println("Would you like to see the remainder? (y/n)");
            String userInput;
            double userOne2 = (double) userOne;
            double answer = (double)(userOne2 / userTwo);
            userInput = sc.nextLine();

        if (userInput.equalsIgnoreCase("y")) {
            System.out.println(userOne + " and " + userTwo + " remainder is " + (userOne % userTwo));
        }
        

        // Fraction answer
        System.out.println("Would you like your answer as a fraction? (frac/deci)");

        // Making a frac
        Fraction frac = new Fraction(userOne, userTwo);

        String userInput2;
        userInput2 = sc.nextLine();

        if (userInput2.equalsIgnoreCase("frac")) {
            System.out.println(frac);
        } if (userInput2.equalsIgnoreCase("deci")) {
            System.out.println(answer);
        }
        
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
