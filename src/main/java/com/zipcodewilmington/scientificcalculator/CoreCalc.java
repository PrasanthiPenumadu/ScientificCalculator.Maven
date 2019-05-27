package com.zipcodewilmington.scientificcalculator;



public class CoreCalc {
    public double basicCalcs (String s, double d, double d2){

        Double result= 0.0;
        switch (s) {
            case "+": result = d + d2;
                break;
            case "-": result = d - d2;
                break;
            case "*": result = d * d2;
                break;
            case "/": result = d / d2;
                if(d2 == 0) {
                    System.out.println("Err");
                }
                break;
            default:
                System.out.println("Please enter a valid input");
                break;
        }
        return result;
    }
    public double advancedCalcs (String s,Double d, Double d2) {

        Double result = 0.0;
        switch (s) {
            case "exponentiation":
                result = Math.pow(d, d2);
                break;
            default:
                System.out.println("Please enter a valid input");
                break;
        }
        return result;
    }

    public double advancedCalcs2 (String s,Double d){

        Double result = 0.0;
        switch (s) {
            case "square root": result = Math.sqrt(d);
                break;
            case "square": result = Math.pow(d, 2);
                break;
            case "invert": result =  -d;
                break;
            case "reciprocal": result = 1.0/d;
                break;
            default:
                System.out.println("Please enter a valid input");
                break;
        }
        return result;
    }
    public String bonusCalcs(String s){
        String result = "";
        switch (s) {
            case "random": result = String.format("%.2f", Math.random() * 100);
                break;
            case "pi": result = String.format("%.2f", Math.PI);
                break;
            default:
                System.out.println("Please enter a valid input");
        }
        return result;
    }
}