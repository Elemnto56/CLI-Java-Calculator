package calculator.misc;

import calculator.Core_Logic.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your equation in terms of x (like x^2 - 4): ");
        String input = sc.nextLine();
        Graph.generateGraph(input);
    }
}
