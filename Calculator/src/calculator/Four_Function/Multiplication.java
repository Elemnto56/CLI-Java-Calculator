package calculator.Four_Function;
import java.util.Scanner;

import calculator.Main;
import calculator.misc.Rudeness;

public class Multiplication {
    public static void main(String[] args) {
        Rudeness rude = new Rudeness();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to multiplication!");

        int firstNumber = 0;
        int secondNumber = 0;

        boolean gotFirstNumber = false;
        boolean gotSecondNumber = false;

        while (gotFirstNumber != true) {
            try {
                System.out.println("Give first number");
                firstNumber = sc.nextInt();
                gotFirstNumber = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(rude.RandomInsult());
            }
        }

        while (gotSecondNumber != true) {
            try {
                System.out.println("Give second number"); 
                secondNumber = sc.nextInt();
                gotSecondNumber = true;
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
