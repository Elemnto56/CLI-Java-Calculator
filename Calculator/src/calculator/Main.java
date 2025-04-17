package calculator;
import java.util.Scanner;
import calculator.Four_Function.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Welcome to Calculator! Type a number for an operation below: ");
        System.out.println("1. Addition \n" + 
        "2. Subtraction \n" + 
        "3. Multiplication \n" + 
        "4. Division \n" + 
        "5. Scientific [BETA!] (powers, sqrt, log, and etc)");
        
        boolean validInput = false;

        while (!validInput) {
            try {
                int userInput = sc.nextInt();
                validInput = true;
                switch (userInput) {
                    case 1:
                        Addition.main(args);
                        break;
                    case 2:
                        Subtraction.main(args);
                        break;
                    case 3:
                        Multiplication.main(args);
                        break;
                    case 4:
                        Division.main(args);
                        break;
                    case 5:
                        Scientific.main(args);
                        break;
                    default:
                        System.out.println("Invalid input");
                }

            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Input a number, not a letter or whatever that was");      
            }
        }
            sc.close();
    }
}