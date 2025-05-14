package questions.Loops;
import java.util.*;

public class SumN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nHow many numbers to add: ");
        
        int total = in.nextInt();
        
        int[] arr = new int[total];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("The number " + (i+1) + " is: ");
            int digit = in.nextInt();
            arr[i] = digit;
        }

        int sum = 0;
        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];
        } 

        System.out.print("\n THE SUM OF " + arr.length + " NUMBERS IS : " + sum);

    }    
}
