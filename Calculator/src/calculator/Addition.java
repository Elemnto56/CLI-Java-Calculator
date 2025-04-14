package calculator;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Rudeness insult = new Rudeness();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Addition!");
        
        int userOne = 0;
        int userTwo = 0;

        // Bool for user inputs if it's truly an int
        boolean gotFirstNumber = false;
        boolean gotSecondNumber = false;

        // Loop until bool is true
        while (!gotFirstNumber) {
            // Exception
            try {
                // First number
                System.out.println("Give first number");
                userOne = sc.nextInt();
                gotFirstNumber = true;
            } catch (Exception e) {
                sc.nextLine(); // Open new line incase failed
                System.out.println(insult.RandomInsult());
            }
        }

        // Loop until bool true
        while (!gotSecondNumber) {
            // Catch for letter and not input
            try {
                // Second number
                System.out.println("Give second number");
                userTwo = sc.nextInt();
                gotSecondNumber = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(insult.RandomInsult());
            }
        }

        // Answer
        System.out.println(userOne + " + " + userTwo + " = " + (userOne + userTwo));

        sc.close();
    }
}