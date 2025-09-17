import java.util.Scanner;
public class Calculator {

    static Scanner input = new Scanner(System.in);

    public static void main (String[] args){


        // ----- START -------------------------------------------------

        // Problem: Create a java program that asks the user for 2 numbers and calculates the sum, difference, product, and modulo (remainder).

        InputValues();

    }

    static void InputValues(){

        int num1 = 0;
        int num2 = 0;

        // -------------------------------------------------------------

        System.out.println("Please enter your first number: ");
        num1 = input.nextInt();
        System.out.println();

        //

        System.out.println("Please enter your second number: ");
        num2 = input.nextInt();
        System.out.println();

        // ----- OUTPUT ----------------------------------------------

        int sum = num1 + num2;
        //
        int difference = num1 - num2;
        //
        int product = num1 * num2;
        //
        int modulo = num1 % num2;

        // -----------------------------------------------------------

        System.out.println("-----------------------------------------");
        System.out.println();

        // 

        System.out.println("Sum of both values: " + sum);
        System.out.println();

        //

        System.out.println("Difference of both values: " + difference);
        System.out.println();

        //

        System.out.println("Product of both values: " + product);
        System.out.println();

        //

        System.out.println("Remainder of both values: " + modulo);
        System.out.println();

        // ----- END --------------------------------------------------
    }
}
