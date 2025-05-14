package questions.Loops;
import java.util.*;

// Finding the fibonacci series again
public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("\nEnter number for fibonacci series: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        
        int[] arr = new int[number];
        arr[0] = 0;
        arr[1] = 1;
        if(number == 0) {
            System.out.println("The fibonacci of 0 is 0");
        }
        else if(number == 1) {
            System.out.println("fibonacci of 1 is 1.");
        }
        else {
            
            for(int i = 2; i < number; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }

        System.out.println("The fibonacci series is: " + Arrays.toString(arr));
    }
}
