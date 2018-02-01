package com.laccan.app.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationIntTest {
    int a = 10, b = 10;

    @Test
    public void sum() {
        int result = a + b;
        int test = (int) Operation.sum(a, b);
        assertEquals(result, test);

    }

    @Test
    public void subtract() {
        int result = a - b;
        int test = (int) Operation.subtract(a, b);
        assertEquals(result, test);
    }

    @Test
    public void division() {
        int result = a / b;
        int test = (int) Operation.division(a, b);
        assertEquals(result, test);
    }

    @Test
    public void multiply() {
        int result = a * b;
        int test = (int) Operation.multiply(a, b);
        assertEquals(result, test);
    }
}