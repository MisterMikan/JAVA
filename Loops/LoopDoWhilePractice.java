import java.util.Scanner;
public class LoopDoWhilePractice {

    static Scanner input = new Scanner(System.in);

public static void main(String[] args) {

// ----- START OF PROGRAM ----------

/* Create a Menu - Driven Calculator using do..while loop.
 * 
 * The program should display a menu with 4 operations:
 * 1.) Addition
 * 2.) Subtraction
 * 3.) Multiplication
 * 4.) Division
 * 5.) Exit
 * 
 * The user chooses an option
 * If the choice is between 1-4, the program asks for two numbers and perform the operation.
 * If the choice is 5, the program ends.
 * If the user enters an invalid choice, show an error message.
 */

 // ----- INPUT ---------------------

 int choice;
 double num1, num2, result;

 // ----- PROCESS -------------------

    do {
        System.out.println("\n--- MENU DRIVEN CALCULATOR ---");
        System.out.println("1.) Addition");
        System.out.println("2.) Subtraction");
        System.out.println("3.) Multiplication");
        System.out.println("4.) Division");
        System.out.println("5.) Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();

    switch (choice) {
        case 1: // ADDITION
            System.out.println("Enter first number: ");
            num1 = input.nextDouble();
            System.out.println("Enter second number: ");
            num2 = input.nextDouble();
            //
            result = add(num1, num2);
            System.out.println("Result: " + result);
            break;

        case 2: // SUBTRACTION
            System.out.println("Enter first number: ");
            num1 = input.nextDouble();
            System.out.println("Enter second number: ");
            num2 = input.nextDouble();
            //
            result = subtract(num1, num2);
            System.out.println("Result: " + result);
            break;

        case 3: // MULTIPLICATION
            System.out.println("Enter first number: ");
            num1 = input.nextDouble();
            System.out.println("Enter second number: ");
            num2 = input.nextDouble();
            //
            result = multiply(num1, num2);
            System.out.println("Result: " + result);
            break;
            
        case 4: // DIVISION
            System.out.println("Enter first number: ");
            num1 = input.nextDouble();
            System.out.println("Enter second number: ");
            num2 = input.nextDouble();
           
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                }
                break;

        case 5: // EXIT
                System.out.println("Exiting program ... Good Bye!");
                break;

        default: // INVALID CHOICE
                System.out.println("Invalid Choice! Please enter a number between 1 and 5.");
        }

    } while (choice != 5); 

    input.close();

}

public static double add(double a, double b) {
    return a + b;
    //
}

public static double subtract(double a, double b) {
    return a - b;
    //
}

public static double multiply(double a, double b) {
    return a * b;
    //
}

public static double divide(double a, double b) {
    return a / b;
    //
}

}






