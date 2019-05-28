package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;


public class ScientificCalc {
    Double memory = 0.0;


    public Double mathOperation(String s, Double d) {

        Double returnValue = 0.0;
        switch (s) {
            case "binary":
                returnValue = Double.valueOf(Integer.toBinaryString(d.intValue()));
                break;
            case "octal":
                returnValue = Double.valueOf(Integer.toOctalString(d.intValue()));
                break;

            case "hexadecimal":
                returnValue = Double.valueOf(Integer.toHexString(d.intValue()));
                break;
            case "decimal":
                DecimalFormat df = new DecimalFormat("####.##");
                returnValue = Double.valueOf(df.format(d));
                break;
            case "sin":
                returnValue = Math.sin(d);
                break;
            case "cos":
                returnValue = Math.cos(d);
                break;
            case "tan":
                returnValue = Math.tan(d);
                break;
            case "inverse sine":
                returnValue = Math.asin(d);
                break;
            case "inverse cosine":
                returnValue = Math.acos(d);
                break;
            case "inverse tan":
                returnValue = Math.atan(d);
                break;
            case "log":
                returnValue = Math.log(d);
                break;
            case "log10":
                returnValue = Math.log10(d);
                break;
            case "inverse natural log":
                returnValue = Math.pow(Math.E, d);
                break;
            case "inverse log":
                returnValue = Math.pow(10, d);
                break;
            case "factorial":
                returnValue = (factorial(Integer.valueOf((int) d.doubleValue()))).doubleValue();
                break;
            case "round":
                returnValue = Double.valueOf(Math.round(d));
                break;
            case "cube":
                returnValue = d * d * d;
                break;
            case "circlearea":
                returnValue = Math.PI * d * d;
                break;
            case "m+":
                returnValue = memory + d;
                break;
            default:
                System.out.println("Please enter a valid input");
                break;
        }
        memory = returnValue;
        return returnValue;
    }

    public Double mathOperation(String s) {
        switch (s) {
            case "mrc":
                break;
            case "mc":
                this.memory = 0.0;
                break;
        }
        return memory;
    }

    public BigInteger factorial(Integer i) {

        BigInteger f = new BigInteger("1");

        for (int j = 1; j <= i; j++) {
            f = f.multiply(BigInteger.valueOf(j));
        }
        memory = f.doubleValue();
        return f;
    }

    public Double mathDegrees(String s, Double d) {
        Double returnValue = 0.0;
        switch (s) {
            case "sin":
                returnValue = Math.sin(Math.toRadians(d));
                break;
            case "cos":
                returnValue = Math.cos(Math.toRadians(d));
                break;
            case "tan":
                returnValue = Math.tan(Math.toRadians(d));
                break;
            case "inverse sine":
                returnValue = Math.asin(Math.toRadians(d));
                break;
            case "inverse cosine":
                returnValue = Math.acos(Math.toRadians(d));
                break;
            case "inverse tan":
                returnValue = Math.atan(Math.toRadians(d));
                break;

        }
        memory = returnValue;
        return returnValue;
    }
}





