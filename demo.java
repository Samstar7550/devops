package com.example;
 
public class Calculator {
    public int add(int a, int b) {
        return (a + b); // Return the sum of a and b
    }
 
    public int divide(int a, int b) {
        if (b == 0) { // Check for division by zero
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return (a / b); // Return the quotient of a and b
    }

    public int multiply(int a, int c) { 
        return (a * c); // Return the product of a and c
    }
}
