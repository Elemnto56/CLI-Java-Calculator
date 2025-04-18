package calculator.Four_Function;
import java.util.Scanner;

import calculator.Main;
import calculator.misc.Rudeness;

public class Subtraction {
    public static void main(String[] args) {
        Rudeness insult = new Rudeness();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Subtraction!");
        
        int userOne = 0;
        int userTwo = 0;

        boolean gotFirstNumber = false;
        boolean gotSecondNumber = false;

        while (!gotFirstNumber) {
            try {
                System.out.println("Type in first number [Note: This will be subtracted by the next]");
                userOne = sc.nextInt();
                gotFirstNumber = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(insult.RandomInsult());
            }
        }

        while (!gotSecondNumber) {
            try {
                System.out.println("Type in second number");
                userTwo = sc.nextInt();
                gotSecondNumber = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(insult.RandomInsult());
            }
        }

        // Answer
        System.out.println(userOne + " - " + userTwo + " = " + (userOne - userTwo));

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
