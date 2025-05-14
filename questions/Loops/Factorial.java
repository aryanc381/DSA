package questions.Loops;
import java.util.*;

// Factorial Program In Java

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter factorial of number: ");
        int num = in.nextInt();

        if (num == 0) {
            System.out.println("\nThe factorial of " + num + " is 1");
        }

        if(num == 1) {
            System.out.println("\nThe factorial of " + num + " is 1");
        }
        int sum = 1;
        System.out.println("\nThe factorial of " + num + " is ");
        for(int i = 1; i <= num; i++) {
            sum *= i;
        }
        System.out.print(sum);
    }
}
