package calculator;

import java.util.Scanner;
import org.apache.commons.math3.fraction.Fraction;

public class FractionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal (e.g. 0.625): ");
        double decimal = sc.nextDouble();

        // Converts the decimal to a fraction with a max denominator of 10,000
        Fraction f = new Fraction(decimal, 10000);

        System.out.println("Fraction: " + f);
        System.out.println("Your double: " + f.doubleValue());

        sc.close();
    }
}
