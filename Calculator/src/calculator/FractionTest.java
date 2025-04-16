package calculator;

import org.apache.commons.math3.fraction.Fraction;

public class FractionTest {
    public static void main(String[] args) {
        Fraction f = new Fraction(5, 8);
        System.out.println("Fraction: " + f);         // ➤ Fraction: 5/8
        System.out.println("As double: " + f.doubleValue());  // ➤ As double: 0.625
    }
}
