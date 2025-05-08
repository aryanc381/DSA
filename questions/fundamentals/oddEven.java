package questions.fundamentals;
import java.util.*;

// Write a program to print whether a number is even or odd, also take input from the user. [3mins req]

public class oddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the number to check if odd or even: ");
        int num = in.nextInt();
        System.out.println("The number is " + checker(num));

    }    

    static String checker(int num) {
        if (num % 2 == 0) {
            return "even";
        }

        return "odd";
    }
}
