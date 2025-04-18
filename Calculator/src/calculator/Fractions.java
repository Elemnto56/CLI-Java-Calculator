package calculator;
import org.apache.commons.math3.fraction.BigFraction;
import java.util.Scanner;

public class Fractions {
    static Scanner sc = new Scanner(System.in);

    public static void addFrac() {
        System.out.println("Type out first Fraction (ex: 3/2): ");
        String userFrac = sc.nextLine();
        
        BigFraction frac = new BigFraction(userFrac);
        System.out.println("Your fraction is: " + frac);
    }

    public static void main(String[] args) {
        addFrac();
    }
}
