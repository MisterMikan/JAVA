import java.util.Arrays;
public class AscendingBubbleSort {

    public static void main(String[] args) {
  
// ----- START OF PROGRAM --------------------------------------------------------------------

// Arrange the given values in an Ascending Array using the Bubble Sort Method.

// ----- INPUT -------------------------------------------------------------------------------

int[] numbers = {45, 12, 89, 33, 7, 56};
int length = numbers.length;

System.out.println("Original Array: " + Arrays.toString(numbers));
System.out.println();

  // ----- PROCESS ---------------------------------------------------------------------------

  for (int i = 0; i < length -1 ; i++) {
    for (int j = 0; j < length - i - 1; j++) {
        if (numbers[j] > numbers[j+1]) {

            int temp = numbers[j];
            numbers[j] = numbers[j+1];
            numbers[j+1] = temp;
     }
    }
  }

  // ----- OUTPUT ----------------------------------------------------------------------------

  System.out.println("Sorted Array in Ascending Order: ");
    for (int num : numbers) {
        System.out.print(num + " ");
  }

  // ----- END OF PROGRAM ---------------------------------------------------------------------
 }   
}
