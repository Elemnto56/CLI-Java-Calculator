import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                System.out.println("Type a number");
            }
        }

        // Second number
        try {
            System.out.println("Give second number");
            userTwo = sc.nextInt();
        } catch (Exception e) {
            
        }
        // Answer
        System.out.println(userOne + " + " + userTwo + " = " + (userOne + userTwo));
    }
}