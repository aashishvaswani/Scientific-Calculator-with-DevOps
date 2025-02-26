package org.aashish.ScientificCalculator;

public class Calculator {

    public double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of negative number is not defined.");
        }
        return Math.sqrt(x);
    }

    public long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial of negative number is not defined.");
        }
        long fact = 1;
        for (int i = 2; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Logarithm of non-positive number is not defined.");
        }
        return Math.log(x);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
