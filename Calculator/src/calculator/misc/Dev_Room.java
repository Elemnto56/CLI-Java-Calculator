package calculator.misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dev_Room {
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