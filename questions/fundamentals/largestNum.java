package questions.fundamentals;
import java.util.*;

// Take 2 numbers as input and print the largest number. [3mins]

public class largestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nPlease enter num1 and num2: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
