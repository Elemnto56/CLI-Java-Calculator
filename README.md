# Java Terminal Calculator

This is a Java-powered calculator that runs in your terminal. It covers the basics like addition, subtraction, multiplication, and division — plus more advanced stuff like fractions, scientific functions (square roots, powers, logs), graphing, and even a little dev-mode to peek into the source code behind everything.

### Features
- Basic operations (add, subtract, multiply, divide)
- Fraction support (enter values like `5/6`, and it'll handle it)
- Scientific functions like powers, square roots, logarithms, and more
- ASCII-based graphing calculator
- A dev menu called **The Distillery** — where you can read the `.java` files that make the calculator work

---

## How to Run It

This project is packaged into a `.jar` file (Java Archive). Here's how to run it:

### 1. Make sure you have Java installed
Open a terminal and run:

```bash
java -version
```
If it's Java 17 or higher, you're good. If not, install one from https://adoptium.net.

### 2. Download the Calculator
Head to the Releases page
Download the file named Calculator.jar.

### 3. Run the Calculator
In your terminal, navigate to where the .jar file is and run:
```bash
java -jar Calculator.jar
```
The calculator will launch in your terminal. Just type a number to select a menu option.

## The Distillery

Option 6 in the main menu opens up a list of .java files you can read inside the program. It shows how the calculator works under the hood — like a walkthrough of the source code.

----Notes----

Scientific and graphing modes are labeled [BETA] — expect occasional quirks.
Runs on Mac, Windows, or Linux — anything with Java.
Terminal support for colors or symbols isn’t required, just nice to have.
Built With

Java 21
No frameworks
Just structured Java files, some logic, and questionable variable names
License

Free to use, study, or modify.
Credit is appreciated, but not required.
Just don’t pretend you wrote the whole thing.
