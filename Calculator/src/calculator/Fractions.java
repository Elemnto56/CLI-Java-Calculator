package calculator;
import org.apache.commons.math3.fraction.BigFraction;

import java.math.BigInteger;
import java.util.Scanner;

public class Fractions {
    static Scanner sc = new Scanner(System.in);

    public static void Fracmaker() {
        // Reminder: 
        System.out.println("Type out first Fraction (ex: 3/2): ");
        String userFrac = sc.nextLine();
        
        String[] fracStrings = userFrac.trim().split("/");

        BigInteger numerator = new BigInteger(fracStrings[0].trim());
        BigInteger denominator = new BigInteger(fracStrings[1].trim());

        BigFraction frac = new BigFraction(numerator, denominator);
        System.out.println("Your fraction is: " + frac);
    }

    public static void main(String[] args) {
        Fracmaker();
    }
}
