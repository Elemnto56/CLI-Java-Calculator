package calculator.Core_Logic;
import org.apache.commons.lang3.math.Fraction;
import org.apache.commons.math3.fraction.BigFraction;

import java.math.BigInteger;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Fractions {
    public static BigFraction Fraction(Scanner sc) {
        System.out.println("Type in your fraction (ex: 5/2): ");
        String userFrac = sc.nextLine();

        String[] fracStrings = userFrac.trim().split("/");

        BigInteger numerator = new BigInteger(fracStrings[0].trim());
        BigInteger denominator = new BigInteger(fracStrings[1].trim());

        BigFraction frac = new BigFraction(numerator, denominator);

        return frac;
    }
    public static void main(String[] args) {
        // No code here... lol
    }
}
