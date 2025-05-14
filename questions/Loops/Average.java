package questions.Loops;
import java.util.*;

// Calculate Average Of N Numbers

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter how many numbers you want in the array: ");
        int total = in.nextInt();
        
        int[] arr = new int[total];
        System.out.println("\nEnter " + total + " numbers: ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Entering number " + (i+1) + " : "); arr[i] = in.nextInt();
        }

        int sum = 0;
        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }

        int average = sum / arr.length;

        System.out.println("THE AVERAGE OF NUMBERS IS: " + average);

    }    
}
