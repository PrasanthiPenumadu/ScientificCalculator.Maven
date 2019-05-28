package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class ScientificCalcTest {


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void mathOperation() {
        ScientificCalc calc = new ScientificCalc();
        assertEquals(1010.0, calc.mathOperation("binary", 10.0), 0);
        assertEquals(20.20, calc.mathOperation("decimal", 20.1999), 0);
        assertEquals(620, calc.mathOperation("octal", 400.00), 0);
        assertEquals(15530, calc.mathOperation("octal", 7000.00), 0);
        assertEquals(3e8, calc.mathOperation("hexadecimal", 1000.00), 0);
        assertEquals(14.0, calc.mathOperation("hexadecimal", 20.00), 0);
        assertEquals(1, calc.mathDegrees("sin", 90.00), 0);
        assertEquals(.9974949866040544, calc.mathOperation("sin", 1.5), 0);
        assertEquals(0.8660254037844387, calc.mathDegrees("cos", 30.00), 0);
        assertEquals(-0.9999987317275395, calc.mathOperation("cos", 3.14), 0);
        assertEquals(0.7131230097859091, calc.mathOperation("tan", 120.00), 0);
        assertEquals(0.5773502691896257, calc.mathDegrees("tan", 30.00), 0);
        assertEquals(0.45151844661923823, calc.mathDegrees("inverse sine", 25.00), 0);
        assertEquals(1.5562572219050328, calc.mathDegrees("inverse cosine", .833), 0);
        assertEquals(0.6657737500283538, calc.mathDegrees("inverse tan", 45.00), 0);
        assertEquals(2.302585092994046, calc.mathOperation("log", 10.00), 0);
        assertEquals(0.6020599913279624, calc.mathOperation("log10", 4.00), 0);
        assertEquals(1, calc.mathOperation("log10", 10.00), 0);
        assertEquals(2.718281828459045, calc.mathOperation("inverse natural log", 1.00), 0);
        assertEquals(22026.465794806703, calc.mathOperation("inverse natural log", 10.00), 0);
        assertEquals(1000, calc.mathOperation("inverse log", 3.00), 0);
        assertEquals(10000, calc.mathOperation("inverse log", 4.00), 0);
        assertEquals(6, calc.mathOperation("factorial", 3.00), 0);
        assertEquals(3628800, calc.mathOperation("factorial", 10.00), 0);
        assertEquals(0.0, calc.mathOperation("mc", 0.0), 0);
        assertEquals(5, calc.mathOperation("round", 5.05), 0);
        assertEquals(6, calc.mathOperation("round", 5.95), 0);
        assertEquals(64, calc.mathOperation("cube", 4.0), 0);
        assertEquals(125, calc.mathOperation("cube", 5.0), 0);
        assertEquals(50.26548245743669, calc.mathOperation("circlearea", 4.0), 0);
    }

    @Test
    public void factorial() {

        ScientificCalc calc = new ScientificCalc();

        BigInteger expected = new BigInteger("39916800");

        BigInteger actual = calc.factorial(11);
        assertEquals("Values should be equal", expected, actual);


    }
}

