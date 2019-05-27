package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to our calculator!");
        String welcome = Console.getStringInput("Please enter 'C'Core Calculator or'S'Scientific Calculator");
        if (welcome.equalsIgnoreCase("S")) {
            String s = Console.getStringInput("Enter the required mathematical operation : ").toLowerCase();
            ScientificCalc scientific = new ScientificCalc();
            while (!s.equalsIgnoreCase("Exit")) {
                //  Integer i = Console.getIntegerInput("Enter an integer value as operand");
                Double d = Console.getDoubleInput("Enter a double value as the number");

                Console.println("The user input %s as the required operation ", s);
                // Console.println("The user input %s as an integer", i);
                Console.println("The user input %s as a input number ", d);
                System.out.println("The computed value of the operation is " + scientific.MathOperation(s, d));

                s = Console.getStringInput("Enter another mathematical operation or 'Exit' to Quit!").toLowerCase();
            }
            System.out.println("Thank you for using our calculator, Enjoy the rest of your day");
        } else {
            CoreCalc core = new CoreCalc();
            String s = Console.getStringInput("Enter an operation").toLowerCase();
            while (!s.equalsIgnoreCase("Exit")) {
                if (s.equalsIgnoreCase("random") || s.equalsIgnoreCase("pi")){
                    System.out.println("The computed value of the operation is " + core.bonusCalcs(s));
                }

                //Console.println("The user input %s as a d", d2);
                if (s.equalsIgnoreCase("square root") || s.equalsIgnoreCase("square") || s.equalsIgnoreCase("invert")) {
                    Double d = Console.getDoubleInput("Enter the first number");
                    System.out.println("The computed value of the operation is " + core.advancedCalcs2(s, d));
                }

                if (s.equalsIgnoreCase("exponentiation")) {
                    Double d = Console.getDoubleInput("Enter the first number");
                    Double d2 = Console.getDoubleInput("Enter the second number");
                    System.out.println("The computed value of the operation is " + core.advancedCalcs(s, d, d2));
                }

                if (s.equalsIgnoreCase("+") || s.equalsIgnoreCase("-") || s.equalsIgnoreCase("*") || s.equalsIgnoreCase("/")) {
                    Double d = Console.getDoubleInput("Enter the first number");
                    Double d2 = Console.getDoubleInput("Enter the second number");
                    System.out.println("The computed value of the operation is " + core.basicCalcs(d, d2, s));
                }


                s = Console.getStringInput("Enter another mathematical operation or 'Exit' to Quit!").toLowerCase();
            }
            System.out.println("Thank you for using our calculator, Enjoy the rest of your day");
        }
    }
}




