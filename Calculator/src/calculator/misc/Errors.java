package calculator.misc;

public class Errors {

    // Thrown when the user input is not a valid number
    public static class NotANumberException extends Exception {
        public NotANumberException() {
            super("Input is not a valid number.");
        }
    }

    // Thrown when division by zero is attempted
    public static class DivisionByZeroException extends Exception {
        public DivisionByZeroException() {
            super("Cannot divide by zero.");
        }
    }

    // Thrown when the user inputs a mathematically undefined fraction (e.g. 0/0)
    public static class UndefinedFractionException extends Exception {
        public UndefinedFractionException() {
            super("Undefined fraction: both numerator and denominator are zero.");
        }
    }

    // Thrown when a fraction is not in the correct format (e.g. missing slash or extra input)
    public static class InvalidFractionFormatException extends Exception {
        public InvalidFractionFormatException() {
            super("Invalid fraction format. Expected format: 'numerator/denominator'.");
        }
    }

    // Thrown when an operation is not supported by the current calculator logic
    public static class UnsupportedOperationException extends Exception {
        public UnsupportedOperationException(String operation) {
            super("Unsupported operation: " + operation);
        }
    }

    // Thrown when a file related to Main.java gets unresolved
    public static class FatalMainException extends Exception {
        public FatalMainException(String message) {
            super("A file related to main encountered the following: " + message);
        }
    }
}