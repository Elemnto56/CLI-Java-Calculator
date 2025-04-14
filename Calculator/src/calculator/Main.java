package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Welcome to Calculator! Type a number for an operation below: ");
        System.out.println("1. Addition \n" + "2. Multiplication");

        int userInput = sc.nextInt();

        switch (userInput) {
            case 1:
                Addition.main(args);
                break;
            case 2:
                Multiplication.main(args);
                break;
        }

        sc.close();
    }
}