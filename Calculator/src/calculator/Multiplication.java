package calculator;
import java.util.Scanner;

class Rudeness {
    String[] insults = {"You're the reason public static void main considers throwing exceptions",
"Your code is so bad, even null values avoid being associated with you",
"You've got less structure than a spaghetti codebase written by a squirrel on caffeine",
"Your logic is like an infinite loop with no break—useless and stuck forever",
"You're the human equivalent of an off-by-one error",
"If I had a byte for every brain cell you used while coding, I'd be in underflow",
"You're like a try-catch block that only catches Ls",
"Even Java's garbage collector wouldn't want to deal with your mess",
"You're the type to dereference a null pointer and then blame the compiler",
"You could refactor a rock and still introduce bugs"};
    public String RandomInsult() {
        int index = (int)((Math.random()) * insults.length);
        return insults[index];
    }
}

public class Multiplication {
    public static void main(String[] args) {
        Rudeness rude = new Rudeness();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to multiplication!");

        int firstNumber = 0;
        int secondNumber = 0;

        boolean gotFirstNumber = false;
        boolean gotSecondNumber = false;

        while (gotFirstNumber != true) {
            try {
                System.out.println("Give first number");
                firstNumber = sc.nextInt();
                gotFirstNumber = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(rude.RandomInsult());
            }
        }

        while (gotSecondNumber != true) {
            try {
                System.out.println("Give second number");
                secondNumber = sc.nextInt();
                gotSecondNumber = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(rude.RandomInsult());
            }
        }

        // Answer
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));

        sc.close();
    }
}
