package questions.fundamentals;
import java.util.*;

// To find Armstrong Number between two given number. 153 = 1^3 + 5^3 + 3^3;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int num = in.nextInt();
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length (); // No of digits
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println("\n" + originalNum + " is an Armstrong Number.");
        } else {
            System.out.println("\n" + originalNum + " is NOT an Armstrong Number.");
        }
    }   
}
