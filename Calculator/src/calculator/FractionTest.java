package calculator;

import java.util.Scanner;
import org.apache.commons.math3.fraction.Fraction;

public class FractionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal (e.g. 0.625): ");
        double decimal = sc.nextDouble();

        // Convert to fraction
        Fraction f = new Fraction(decimal, 1.0e-10); // 1.0e-10 = max error tolerance

        // Output
        System.out.println("Fraction: " + f);              // ➤ 5/8
        System.out.println("As double: " + f.doubleValue()); // ➤ 0.625

        sc.close();
    }
}
