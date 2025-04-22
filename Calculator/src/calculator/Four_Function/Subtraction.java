package calculator.Four_Function;
import java.util.Scanner;

import calculator.Core_Logic.Fractions;
import calculator.Main;
import calculator.misc.Rudeness;

public class Subtraction {
    public static void main(String[] args) {
        Rudeness insult = new Rudeness();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Subtraction!");
        
        int userOne = 0;
        int userTwo = 0;

        System.out.println("Would you like to subtract fractions? (y/n)");
        String userFrac = sc.nextLine();
        if (userFrac.equalsIgnoreCase("y")) {
            var fraction = Fractions.Fraction(sc);
            var fraction2 = Fractions.Fraction(sc);

            System.out.println(fraction.subtract(fraction2));
            System.exit(0);
        } if (userFrac.equalsIgnoreCase("n")) {
            System.out.println("Continuing on with standard subtraction");
        }

        while (true) {
            try {
                System.out.println("Type in first number [Note: This will be subtracted by the next]");
                userOne = sc.nextInt();
                break;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(insult.RandomInsult());
            }
        }

        while (true) {
            try {
                System.out.println("Type in second number");
                userTwo = sc.nextInt();
                break;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(insult.RandomInsult());
            }
        }

        // Answer
        System.out.println(userOne + " - " + userTwo + " = " + (userOne - userTwo));

        sc.nextLine();
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
