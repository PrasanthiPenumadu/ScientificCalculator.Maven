package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to our calculator!");
        String s = Console.getStringInput("Please enter 'C'Core Calculator or'S'Scientific Calculator");
        while (!s.equalsIgnoreCase(("exit"))) {
            while (s.equalsIgnoreCase("S")) {
                ScientificCalc scientific = new ScientificCalc();
                s = Console.getStringInput("Enter the required mathematical operation : ").toLowerCase();
                while (!s.equalsIgnoreCase("c") && !s.equalsIgnoreCase("exit")) {
                    if (!(s.equalsIgnoreCase("mc") || s.equalsIgnoreCase("mrc"))) {
                        Double d = Console.getDoubleInput("Enter a double value as the operand");
                        Console.println("The user input %s as the required operation ", s);
                        Console.println("The user input %s as a input operand ", d);
                        System.out.println("The " + s + " of " + d + " is " + scientific.MathOperation(s, d));
                    }
                    if (s.equalsIgnoreCase("mrc"))
                        System.out.println("The value stored in calculator is " + scientific.MathOperation(s));
                    if (s.equalsIgnoreCase("mc"))
                        System.out.println("The value stored in calculator is set to " + scientific.MathOperation(s));
                    s = Console.getStringInput("Enter another mathematical operation or 'Exit' to Quit or 'C' to switch to Core Calculator!").toLowerCase();
                }
            }
        while (s.equalsIgnoreCase("C")) {
            CoreCalc core = new CoreCalc();
            String s = Console.getStringInput("Enter an operation").toLowerCase();
             while(!(s.equalsIgnoreCase("s"))&&!(s.equalsIgnoreCase("exit"))) {
                   
                if (s.equalsIgnoreCase("random") || s.equalsIgnoreCase("pi")){
                    System.out.println("The computed value of the operation is " + core.bonusCalcs(s));
                }

        
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
        }
    }
            System.out.println("Thank you for using our calculator, Enjoy the rest of your day");
        
    }
}




