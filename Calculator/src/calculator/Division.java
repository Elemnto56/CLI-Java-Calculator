package calculator;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Rudeness insult = new Rudeness();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to division!");

        int userOne = 0;
        int userTwo = 0;

        boolean gotFirstNumber = false;
        boolean gotSecondNumber = false;

        while (!gotFirstNumber) {
            try {
                System.out.println("Type in first number: ");
                userOne = sc.nextInt();
                gotFirstNumber= true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(insult.RandomInsult());
            }
        }
    }
}
