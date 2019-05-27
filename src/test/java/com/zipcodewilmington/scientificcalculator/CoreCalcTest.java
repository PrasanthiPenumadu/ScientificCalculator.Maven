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

        assertEquals("12", calc.basicCalcs("+", 5,7));







    }

    @Test
    public void advancedCalcs() {
        CoreCalc calc = new CoreCalc();
        assertEquals(calc.advancedCalcs("square root", 4,2);


    }

    @Test
    public void advancedCalcs2() {
    }
}