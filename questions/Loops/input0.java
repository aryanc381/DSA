package questions.Loops;
import java.util.*;

// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

public class input0 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        while(num != 0) {
            System.out.print("\n\nEnter number: ");
            num = in.nextInt();
            sum += num;
            System.out.print("The new sum is: " + sum);
        }
    }    
}
