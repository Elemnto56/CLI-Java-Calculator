package calculator;
import java.util.Scanner;
import org.apache.commons.math3.fraction.Fraction;
import calculator.Four_Function.Multiplication;

public class Scientific {
    static Scanner sc = new Scanner(System.in);
    static Rudeness insult = new Rudeness();
    static int maxDenominator = 10000;

    public static void exponents() {
        System.out.println("Type in base number: ");
        double baseNum = sc.nextDouble();

        System.out.println("Type in power: ");
        double powerNum = sc.nextDouble();
        
        double answer = Math.pow(baseNum, powerNum);
    
        System.out.println(answer);
        System.out.println(insult.RandomInsult());
    }

    public static void sqrt() {
        System.out.println("Type in radicand (Number that will be squre rooted): ");
        double radicand = sc.nextDouble();
        sc.nextLine();

        double answer = Math.sqrt(radicand);
        Fraction frac = new Fraction(answer, maxDenominator);

        System.out.println("Would you like to see fraction or decimal? (frac/deci): ");
        String userInput = sc.nextLine();

        if (userInput.equalsIgnoreCase("frac")) {
            System.out.println(frac);
        } if (userInput.equalsIgnoreCase("deci")) {
            System.out.println(answer);
        }
    }
    public static void main(String[] args) {
        System.out.println("Choose an operation.");
        System.out.println("1. Exponents \n" + "2. Square Root");

        int userChoice = sc.nextInt();

        switch (userChoice) {
            case 1:
                exponents();
                break;
            case 2:
                sqrt();
                break;
        }
    }
}