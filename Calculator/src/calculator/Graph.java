package calculator;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import javax.swing.*;
import java.awt.*;

public class Graph extends JPanel {

    private Expression parsedExpr;
    private String exprText;

    public Graph(String exprText) {
        this.exprText = exprText;
        try {
            parsedExpr = new ExpressionBuilder(exprText)
                    .variable("x")
                    .build();
        } catch (Exception e) {
            parsedExpr = null;
            System.err.println("Failed to parse expression: " + exprText);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawAxes(g);
        if (parsedExpr != null) drawFunction(g);
    }

    private void drawAxes(Graphics g) {
        g.setColor(Color.GRAY);
        int midX = getWidth() / 2;
        int midY = getHeight() / 2;
        g.drawLine(0, midY, getWidth(), midY);  // X-axis
        g.drawLine(midX, 0, midX, getHeight()); // Y-axis
    }

    private void drawFunction(Graphics g) {
        g.setColor(Color.RED);
        int w = getWidth();
        int h = getHeight();
        int midX = w / 2;
        int midY = h / 2;

        for (int px = 0; px < w; px++) {
            double mathX = (px - midX) / 20.0; // scale: 20 pixels = 1 unit
            try {
                parsedExpr.setVariable("x", mathX);
                double mathY = parsedExpr.evaluate();
                int py = (int)(midY - mathY * 20); // invert Y and scale

                if (py >= 0 && py < h) {
                    g.fillRect(px, py, 2, 2);
                }
            } catch (Exception ignored) {
                // skip bad points (e.g., divide by zero)
            }
        }
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter an expression in x (e.g. x^2 + 3*x - 4):");

        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No input. Exiting.");
            return;
        }

        JFrame frame = new JFrame("Graph: y = " + input);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new Graph(input));
        frame.setVisible(true);
    }
}
