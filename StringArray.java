public class StringArray {

    public static void main(String[] args) {

// ----- START OF PROGRAM --------------------------------------------------------------------

//Declare and initialize a string array

// ----- INPUT -------------------------------------------------------------------------------

String[] fruits = {"Apple", "Banana", "Cherry", "Grapes", "Peach"};
int length = fruits.length;

// ----- PROCESS -----------------------------------------------------------------------------

System.out.println("Number of Fruits: " + length);

for (String fruit : fruits) {

// ----- OUTPUT ------------------------------------------------------------------------------

    System.out.println(fruit);
  }

// ----- END OF PROGRAM ----------------------------------------------------------------------
 }
}
