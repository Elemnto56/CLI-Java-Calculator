package calculator;

import org.apache.commons.math3.fraction.Fraction;

public class FractionTest {
    public static void main(String[] args) {
        // Create a fraction 5/8
        Fraction f = new Fraction(5, 8);

        // Output as a fraction string
        System.out.println("Fraction: " + f); // ➤ 5/8

        // Output as a decimal (double)
        System.out.println("As double: " + f.doubleValue()); // ➤ 0.625
    }
}
