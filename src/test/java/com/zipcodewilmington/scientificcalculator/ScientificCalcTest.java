package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

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

        assertEquals("1010",calc.MathOperation("binary", 10.0));
        assertEquals("100101100.01", calc.MathOperation("binary",300.25));
        assertEquals("620", calc.MathOperation("octal",400));
        assertEquals("15530",calc.MathOperation("octal", 7000));
        assertEquals("3e8", calc.MathOperation("hexadecimal",1000));
        assertEquals("1E",calc.MathOperation("hexadecimal",30));
        assertEquals("-0.866", calc.MathOperation("sin",300));
        assertEquals(".999", calc.MathOperation("sin",1.571));
        assertEquals("0.8660",calc.MathOperation("cos",30));
        assertEquals("-0.99", calc.MathOperation("cos",3.14));
        assertEquals(".713",calc.MathOperation("tan",120));
        assertEquals(".577", calc.MathOperation("tan", 30));
        assertEquals("35",calc.MathOperation("inverse sine",.57));
        assertEquals("39.0",calc.MathOperation("inverse sine",.6293));
        assertEquals("33.6",calc.MathOperation("inverse cosine",.833));
        assertEquals("45",calc.MathOperation("inverse tan",1));
        assertEquals("36.9",calc.MathOperation("inverse tan",.75));
        assertEquals("1",calc.MathOperation("log",10));
        assertEquals("3",calc.MathOperation("log",1000));
        assertEquals(".602",calc.MathOperation("log10",4));
        assertEquals("1",calc.MathOperation("log10",10));
        assertEquals("0",calc.MathOperation("inverse natural log",1));
        assertEquals("2.30",calc.MathOperation("inverse natural log",10));
        assertEquals("1000",calc.MathOperation("inverse log",3));
        assertEquals("10000",calc.MathOperation("inverse log",4));
        assertEquals("6",calc.MathOperation("factorial",3));
        assertEquals("3628800",calc.MathOperation("factorial",10));
        assertEquals("10",calc.MathOperation("mr", 10));
        assertEquals("10",calc.MathOperation("mc",0.0));


    }

    @Test
    public void factorial() {

        ScientificCalc calc = new ScientificCalc();

        BigInteger expected = new BigInteger("39916800");

        BigInteger actual = calc.factorial(11);
        assertEquals("Values should be equal", expected, actual);



    }
}