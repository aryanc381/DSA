package questions.fundamentals;
import java.util.*;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest. [4mins]

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("\nPlease enter P T R: ");
        int principal = in.nextInt();
        int time = in.nextInt();
        int rate = in.nextInt();

        int si = (principal * time * rate) / 100;

        System.out.println("\nThe simple interest is : " + si);
    }

}
