import java.util.Scanner;
public class PalindromeCheck {

    static Scanner input = new Scanner(System.in);

public static void main(String[] args) {

// ----- START ------------------------------------------------------------------------------------------

//Write a Java program that asks the user to enter a 3-digit number.
/*If the number is a palindrome (reads the same forward and backward, like 121 or 343), display "The number is a palindrome." */
/*Else, display "The number is not a palindrome." */

// ----- INPUT ------------------------------------------------------------------------------------------

System.out.println("Enter a 3-digit number: ");
int number = input.nextInt();

int original = number;
int reversed = 0;

// ----- PROCESS -----------------------------------------------------------------------------------------

while (number != 0) {
    int digit = number % 10;
    reversed = reversed * 10 + digit;
    number /= 10;    
}

// ----- OUTPUT -------------------------------------------------------------------------------------------

if (original == reversed) {
    System.out.println(original + " is a palindrome.");
}else {
    System.out.println(original + " is not a palindrome.");
}

    input.close();

// ----- END OF PROGRAM -----------------------------------------------------------------------------------

    }
}