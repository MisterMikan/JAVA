import java.util.Scanner;
public class Rectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Write a Java program that asks the user to enter the length and with of a rectangle. Then calculate and display the Area and Perimeter.

        // -----ENTER THE LENGTH -----------------------------------------

        System.out.println("Please enter the length of the rectangle:");
        int length = scan.nextInt();
        System.out.println();

        // -----ENTER THE WIDTH ------------------------------------------

        System.out.println("Please enter the width of the rectangle:");
        int width = scan.nextInt();
        System.out.println();

        // -----CONVERT INTO AREA & PERIMETER ----------------------------

        int area = length * width;
        int perimeter = (length + width) * 2;

        // -----DISPLAY THE CONVERTED AREA & PERIMETER -------------------

        System.out.println("The AREA of the rectangle is: " + area);
        System.out.println();
        System.out.println("The PERIMETER of the rectangle is: " + perimeter);

scan.close();

        // -----END OF PROGRAM -------------------------------------------



    }
    
}
