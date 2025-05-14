package questions.Loops;
import java.util.*;

// Calculate Average Marks

public class MarksAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the number of subjects: ");
        int total = in.nextInt();
        int[] arr = new int[total];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter subject " + (i + 1) + " marks : "); arr[i] = in.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int avg = sum / arr.length;
        System.out.print("\nTHE AVERAGE MARKS OF " + total + " SUBJECTS IS : " + avg);
    }    
}
