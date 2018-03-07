package br.ufal.ts.app.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationDoubleTest {
    double a = 0, b = 0;

    @Test
    public void sum() {
        double result = a + b;
        double test = Operation.sum(a, b);
        assertEquals(result, test, 0);

    }

    @Test
    public void subtract() {
        double result = a - b;
        double test = Operation.subtract(a, b);
        assertEquals(result, test, 0);
    }

    @Test
    public void division() {
        double result = a / b;
        double test = Operation.division(a, b);
        assertEquals(result, test, 0);
    }

    @Test
    public void multiply() {
        double result = a * b;
        double test = Operation.multiply(a, b);
        assertEquals(result, test, 0);
    }
}