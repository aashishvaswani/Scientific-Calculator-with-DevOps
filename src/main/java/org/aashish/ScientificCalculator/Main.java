package org.aashish.ScientificCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("\nScientific Calculator - Choose an operation from the below options:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.squareRoot(num1));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Result: " + calculator.factorial(num2));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double num3 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.naturalLog(num3));
                    break;
                case 4:
                    System.out.print("Enter base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (b): ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + calculator.power(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
