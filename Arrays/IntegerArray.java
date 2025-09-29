public class IntegerArray {
    
    public static void main(String[] args) {

// ----- START OF PROGRAM --------------------------------------------------------------------

// Declare and initialize an array of integers.

// ----- INPUT -------------------------------------------------------------------------------

int[] numbers = {10, 20, 30, 40, 50};
int length = numbers.length;

// ----- PROCESS -----------------------------------------------------------------------------

System.out.println("First Element: " + numbers[0]);
System.out.println();

System.out.println("Third Element: " + numbers[2]);
System.out.println();

// ----- OUTPUT -------------------------------------------------------------------------------

System.out.println("All elements in the array:");
for (int i = 0; i < length; i++) {
    System.out.println(numbers[i]);

// ----- END OF PROGRAM -----------------------------------------------------------------------

  }
 }
}