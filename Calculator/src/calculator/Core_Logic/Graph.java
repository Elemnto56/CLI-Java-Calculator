package calculator.Core_Logic;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import java.util.Scanner;

public class Graph {
    static String expr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your equation in terms of x (like x^2 - 4): ");
        String input = sc.nextLine();
        Graph.generateGraph(input);
        sc.close();
    }

    public static void generateGraph(String expr) {
        int width = 80;
        int height = 25;
        char[][] graph = new char[height][width];

        // Fill with blank spaces
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                graph[i][j] = ' ';
            }
        }

        int midY = height / 2;
        int midX = width / 2;

        // Draw axes
        for (int i = 0; i < height; i++) graph[i][midX] = '|';
        for (int i = 0; i < width; i++) graph[midY][i] = '-';
        graph[midY][midX] = '+';

        try {
            Expression e = new ExpressionBuilder(expr).variable("x").build();

            for (int x = -midX; x < midX; x ++) {
                double yVal = e.setVariable("x", x).evaluate();
                int y = midY - (int) Math.round(yVal);

                int col = x + midX;

                if (y >= 0 && y < height && col >= 0 && col < width) {
                    graph[y][col] = '*';
                }
            }
        } catch (Exception ex) {
            System.out.println("Invalid expression.");
            return;
        }

        // Print graph
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
    }
}
