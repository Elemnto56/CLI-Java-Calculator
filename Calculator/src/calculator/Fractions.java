package calculator;
import org.apache.commons.math3.fraction.*;
import java.util.Scanner;

public class Fractions {
    static Scanner sc = new Scanner(System.in);
    static int numerator = 0;
    static int denominator = 0;
    static Fraction frac = new Fraction(numerator, denominator);

    public static void addFrac() {
        System.out.println("What is the numerator: ");
        numerator = sc.nextInt();

        System.out.println("What is the denominator; ");
        denominator = sc.nextInt();

        
    }
}
