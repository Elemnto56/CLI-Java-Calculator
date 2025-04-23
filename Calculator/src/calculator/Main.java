package calculator;
import java.util.Scanner;
import calculator.Core_Logic.Scientific;
import calculator.Four_Function.*;
import calculator.misc.Errors;
import calculator.misc.Errors.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Welcome to Calculator! Type a number for an operation below: ");
        System.out.println("""
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Scientifc [BETA!] (powers, sqrt, log, etc)
                7. Quit
                """);
        
        boolean validInput = false;

        while (!validInput) {
            try {
                int userInput = sc.nextInt();
                validInput = true;
                switch (userInput) {
                    case 1 -> Addition.main(args);
                    case 2 -> Subtraction.main(args);
                    case 3 -> Multiplication.main(args);
                    case 4 -> Division.main(args);
                    case 5 -> Scientific.main(args);
                    case 7 -> System.exit(0);
                    default -> System.out.println("Invalid input");
                }

            } catch (Exception e) {
                sc.nextLine();
                throw Errors.FatalMainException("The current file could not operate as supposed to");
                // System.out.println("Input a number, not a letter or whatever that was");      
            }
        }
            sc.close();
    }
}