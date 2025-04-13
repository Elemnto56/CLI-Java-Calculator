import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Addition!");
        
        // Exception
        try {
            // First number
            System.out.println("Give first number");
            int userOne = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Type a number");
        }
        // Second number
        System.out.println("Give second number");
        int userTwo = sc.nextInt();

        // Answer
        System.out.println(userOne + " + " + userTwo + " = " + (userOne + userTwo));
    }
}