package org.ufal.laccan.app.calculator;

public class Operation {


    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double division(double a, double b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("log: Invalid operation");
        }
        return -1;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

}
