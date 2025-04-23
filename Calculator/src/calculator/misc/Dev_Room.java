package calculator.misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Dev_Room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Welcome to the Dev Room! Or, as the dev calls it: "The Distillery"!
                Pick a file to view:
                [1] Addition.java
                [2] Subtraction.java
                [3] Multiplication.java
                [4] Division.java
                """);

        int userInput = sc.nextInt();
        switch (userInput) {
            case 1 -> printFile("/home/pi/my-code-project/Calculator/src/calculator/Four_Function/Addition.java");
            case 2 -> printFile("calculator/Four_Function/Subtraction.java");
            case 3 -> printFile("calculator/Four_Function/Multiplication.java");
            case 4 -> printFile("calculator/Four_Function/Division.java");
            default -> System.out.println("An error occured");
        }
    }
    
    public static void printFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Oops! Could not read " + fileName);
        }
    }

}