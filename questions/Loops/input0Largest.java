package questions.Loops;
import java.util.*;

// Take integer inputs till the user enters 0 and print the largest number from all.

public class input0Largest {
    public static void main(String[] args) {
        System.out.println("\n TO FIND THE LARGEST NUMBER");

        int number = 1;
        int[] arr = new int[10];
        int counter = 0;
        int i = 0;
        Scanner in = new Scanner(System.in);
        while(number != 0 || counter < 9) {
            System.out.print("Add number for counter " + counter + " : ");
            int digit = in.nextInt();
            arr[i] = digit;
            counter++;
            i++;
        }
        System.out.print("The array formed is: " + Arrays.toString(arr));

        // SORTING
        for(int k = 0; k < arr.length; k++) {
            for(int j = 0; j < arr.length - k - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = arr[j];
                }
            }
        }

        System.out.println("THE SORTED ARRAY IS : " + Arrays.toString(arr));
        System.out.println("THE BIGGEST ELEMENT IS: " + arr[arr.length-1]);
    }
}
