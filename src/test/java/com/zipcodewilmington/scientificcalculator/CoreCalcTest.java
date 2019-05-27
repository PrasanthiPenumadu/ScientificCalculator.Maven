package com.zipcodewilmington.scientificcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoreCalcTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void basicCalcs() {
        CoreCalc calc = new CoreCalc();

        assertEquals("19", calc.basicCalcs("+", 9,10));
        assertEquals("10",calc.basicCalcs("+",3,7));
        assertEquals("4",calc.basicCalcs("-",11,7));
        assertEquals("6",calc.basicCalcs("-",100,94));
        assertEquals("9",calc.basicCalcs("*",3,3));
        assertEquals("121",calc.basicCalcs("*",11,11));
        assertEquals("5",calc.basicCalcs("/",15,3));
        assertEquals("error",calc.basicCalcs("/",15,0));

    }

    @Test
    public void advancedCalcs() {
        CoreCalc calc = new CoreCalc();
        assertEquals("125",calc.advancedCalcs("exponentiation",5.0,3.0);


    }

    @Test
    public void advancedCalcs2() {
        CoreCalc calc = new CoreCalc();
        assertEquals("12",calc.advancedCalcs2("square root",144.0));
        assertEquals("36",calc.advancedCalcs2("sqaure",6.0));
        assertEquals("-99",calc.advancedCalcs2("invert",99.0));
        assertEquals("1.0/10.0",calc.advancedCalcs2("reciprocal",10.0));



    }
}