import java.util.Scanner;
public class SimpleTaxCalc {
    
// ----- START OF PROGRAM ------------------------------------------------------------------------

// Write a Java program that acts as a simple tax caluclator. The program should:

/* 1.) Asks the user to input their annual income.
 * 2.) Based on the income, calculate the tax to be paid using the following rules:
 * 
 * 0 - 250,000 - no tax.
 * 250,001 - 400,00 - 10% of the excess over 250,000.
 * 400,001 - 800,000 - 15% of the excess over 400,000 + 15,000.
 * 800,001 - 2,000,000 - 20% of the excess over 800,000 + 75,000.
 * 2,000,001 - 8,000,000 - 25% of the excess over 2,000,000 + 335,000,
 * Above 8,000,000 - 30% of the excess over 8,000,000 + 2,195,000.
 * 
 * 3.) Display the total tax payable.
 * If the user enters a negative income display "Invalid Income Entered.".
 */

 // ----- INPUT ----------------------------------------------------------------------------------
 
public static double CalculateTax(double income) {
    if (income < 0) {
        System.out.println("Invalid Income Entered.");
        return -1;
        //
}else if (income <= 250000) {
    System.out.println("No Tax.");
    return 0;
    //
}else if (income <= 400000) {
    double tax = (income - 250000) * 0.10;
    System.out.println("You have " + tax + " tax.");
    return tax;
    //
}else if (income <= 800000) {
    double tax = (income - 400000) * 0.15 + 15000;
    System.out.println("You have " + tax + " tax.");
    return tax;
    //
}else if (income <= 2000000) {
    double tax = (income - 800000) * 0.20 + 75000;
    System.out.println("You have " + tax + " tax.");
    return tax;
    //
}else if (income <= 8000000) {
    double tax = (income - 2000000) * 0.25 + 335000;
    System.out.println("You have " + tax + " tax.");
    return tax;
    //
}else {
    return (income - 8000000) * 0.30 + 2195000;
}

    }
   
 // ----- OUTPUT ---------------------------------------------------------------------------------

 public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your Annual Income: ");
    double income = scan.nextDouble();

    CalculateTax(income);

    scan.close();

    }
 }

// ----- END OF PROGRAM ---------------------------------------------------------------------------
   
