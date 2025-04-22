package calculator.Core_Logic;
import org.apache.commons.lang3.math.Fraction;
import org.apache.commons.math3.fraction.BigFraction;

import java.math.BigInteger;
import java.util.Scanner;

public class Fractions {
    static Scanner sc = new Scanner(System.in);

    public static BigFraction FirstFraction() {
        System.out.println("Type in your fraction (ex: 5/2): ");
        String userFrac = sc.nextLine();

        String[] fracStrings = userFrac.trim().split("/");

        BigInteger numerator = new BigInteger(fracStrings[0].trim());
        BigInteger denominator = new BigInteger(fracStrings[1].trim());

        BigFraction frac = new BigFraction(numerator, denominator);

        return frac;
    }

    /* 
    public static BigFraction SecondFraction() {
        System.out.println("Type in your fraction (10/4): ");
        String userFrac = sc.nextLine();
        
        String[] fracStrings = userFrac.trim().split("/");

        BigInteger numerator = new BigInteger(fracStrings[0].trim());
        BigInteger denominator = new BigInteger(fracStrings[1].trim());

        BigFraction frac = new BigFraction(numerator, denominator);

        return frac;
    }
    */

    public static Fraction SecondFraction(int a, int b) {
        Fraction frac = Fraction.getFraction(a, b);
        return frac;
    }

    public static void FracAddition() {
        System.out.print("Type out first Fraction (ex: 3/2): ");
        String userFrac = sc.nextLine();
        
        String[] fracStrings = userFrac.trim().split("/");

        BigInteger numerator = new BigInteger(fracStrings[0].trim());
        BigInteger denominator = new BigInteger(fracStrings[1].trim());

        BigFraction frac = new BigFraction(numerator, denominator);
        
        System.out.print("Type out second Fraction (ex: 4/5): ");
        String userFracTwo = sc.nextLine();

        String[] fracStringstwo = userFracTwo.trim().split("/");

        BigInteger numeratortwo = new BigInteger(fracStringstwo[0].trim());
        BigInteger denominatortwo = new BigInteger(fracStringstwo[1].trim());

        BigFraction frac2 = new BigFraction(numeratortwo, denominatortwo);

        System.out.println("Answer: " + frac.add(frac2));
    }
    public static void main(String[] args) {
        
    }
}
