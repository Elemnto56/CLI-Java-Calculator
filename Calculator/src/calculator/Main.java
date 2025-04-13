package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Welcome to Calculator! Choose an operation below: ");
        System.out.println("1. Addition \n" + "2. Multiplication");

        int userInput = sc.nextInt();

        switch (userInput) {
            case 1:
                Addition.main(args);
            case 2:
                Multiplication.main(args);
        }

        sc.close();
    }
}