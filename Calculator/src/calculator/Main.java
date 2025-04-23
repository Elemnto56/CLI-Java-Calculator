package calculator;
import java.util.Scanner;
import calculator.Core_Logic.*;
import calculator.Four_Function.*;
import calculator.misc.Errors.FatalMainException;
import calculator.misc.Errors.NotANumberException;

public class Main {
    public static void main(String[] args) throws FatalMainException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Welcome to Calculator! Type a number for an operation below: ");
        System.out.println("""
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Advanced Mathematics [Gra]
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
                throw new FatalMainException("A fatal error with the current file occured.");
                // System.out.println("Input a number, not a letter or whatever that was");      
            }
        }
            sc.close();
    }

    @SuppressWarnings("resource")
    public static void AdvancedSubMenu(String[] args) throws NotANumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sub-menu of Advanced Mathematics");
        System.out.println("""
                1. Scientifc [BETA!] (powers, sqrt, log, etc)
                2. Graphing Calculator [Errors can occur]
                """);

                try {
                    int userInput = sc.nextInt();
                    switch (userInput) {
                        case 1 -> Scientific.main(args);
                        case 2 -> Graph.main(args);
                    }
                } catch (Exception e) {
                    throw new NotANumberException();                   
                }

        sc.close();
    }
}