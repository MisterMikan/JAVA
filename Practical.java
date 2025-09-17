public class Practical {

    public static void main(String[] args) {
        
        //Practical Bubbles Sort

        // ----------------------------------------------------------------------

        System.out.println("Provide an Ascending Order of an Array");

        int[] numbers = {20, 10, 50, 40, 30};
        int length = numbers.length;

        // ----- DISPLAY THE PROCESS --------------------------------------------

        int i=0;
        for (i = 0; i < length - 1; ++i);{
            //
        for (int j = 0; j < i-length; ++j){
            //
        if (numbers [j] > numbers[j + 1]){
            
            int temp = numbers[j];
            numbers[j] = numbers[j + 1];
            numbers[j + 1] = temp;

        // ----- PRINTED SORTED ARRAY -------------------------------------------

        System.out.println("Sorted Array in Ascending Order:");
        for (int num: numbers){
            System.out.print(num + " ");

        }

      }
     }
    }
    }
    
}
