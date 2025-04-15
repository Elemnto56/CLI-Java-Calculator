package calculator;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import java.util.Scanner;

public class Exp4jExample {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                    System.out.print("Enter a math expression: ");
                            String input = sc.nextLine();

                                    try {
                                                Expression expr = new ExpressionBuilder(input).build();
                                                            double result = expr.evaluate();
                                                                        System.out.println("Result: " + result);
                                                                                } catch (Exception e) {
                                                                                            System.out.println("Error: " + e.getMessage());
                                                                                                    }

                                                                                                            sc.close();
                                                                                                                }
                                                                                                                }
                                                                                                                
