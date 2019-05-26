package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String sChoose = Console.getStringInput("Do you need a basic or scientific calculator");
        if (sChoose.equalsIgnoreCase("scientific")) {

            ScientificCalc sci = new ScientificCalc();
            String s = Console.getStringInput("Enter a string").toLowerCase();
            Integer i = Console.getIntegerInput("Enter an integer");
            Double d = Console.getDoubleInput("Enter a double.");

            if (s.equalsIgnoreCase("FACTORIAL")) {
                System.out.println(sci.factorial(i));
            }
            if (s.equalsIgnoreCase("sin") || s.equalsIgnoreCase("cos") || s.equalsIgnoreCase("tan") || s.equalsIgnoreCase("Inverse sine") || s.equalsIgnoreCase("Inverse cosine") || s.equalsIgnoreCase("Inverse tan")) {
                // System.out.println("Enter Degree or Radians");
                String dr = Console.getStringInput("Enter Degrees or Radians");
                if (dr.equalsIgnoreCase("radians"))
                    System.out.println(sci.trig(s, d));
                else if (dr.equalsIgnoreCase("degrees"))
                    System.out.println(sci.trigdeg(s, d));
            }
            if (s.equals("BINARY") || s.equals("OCTAL") || s.equals("HEXADECIMAL") || s.equals("DECIMAL")) {
                System.out.println(sci.switchDisplayMode(s, i));
            }
            if (s.equalsIgnoreCase("log") || s.equalsIgnoreCase("log10") || s.equalsIgnoreCase("inverse log") || s.equalsIgnoreCase("Inverse natural log")) {
                System.out.println(sci.logfns(s, d));
            }
        } else {

            CoreCalc core = new CoreCalc();
            String s = Console.getStringInput("Enter a string").toLowerCase();
            Double d = Console.getDoubleInput("Enter a double.");
            Double d2 = Console.getDoubleInput("Enter another double.");
            Console.println("The user input %s as a d", d2);

            if (s.equalsIgnoreCase("+") || s.equalsIgnoreCase("-") || s.equalsIgnoreCase("*") || s.equalsIgnoreCase("\n")) {
                System.out.println(core.basicCalcs(d, d2, s));
            }
            if (s.equalsIgnoreCase("square root") || s.equalsIgnoreCase("square") || s.equalsIgnoreCase("exponentiation") || s.equalsIgnoreCase("invert")) {
                System.out.println(core.advancedCalcs(s, d, d2));
            }
        }
    }
}

