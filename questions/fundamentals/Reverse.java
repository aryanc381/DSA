package questions;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();

        int answer = 0;

        while (num > 0) {
            int rem = num % 10;
            answer = answer * 10 + rem;
            num /= 10;
        }

        System.out.println("The reversed sequence is: " + answer);
    }
}
