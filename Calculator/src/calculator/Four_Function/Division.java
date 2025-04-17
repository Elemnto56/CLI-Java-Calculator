package calculator.Four_Function;
import java.util.Scanner;
import org.apache.commons.math3.fraction.Fraction;

public class Division {
    public static void main(String[] args) {
        Rudeness insult = new Rudeness();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to division!");

        int userOne = 0;
        int userTwo = 0;

        boolean gotFirstNumber = false;
        boolean gotSecondNumber = false;

        while (!gotFirstNumber) {
            try {
                System.out.println("Type in first number: ");
                userOne = sc.nextInt();
                gotFirstNumber= true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(insult.RandomInsult());
            }
        }

        while (!gotSecondNumber) {
            try {
                System.out.println("Type second number: ");
                userTwo = sc.nextInt();
                gotSecondNumber = true;
                sc.nextLine();
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

        sc.close();
    }
}
