package questions.fundamentals;
import java.util.*;

// Take name as input and print a greeting message for that particular name. [4mins]

public class name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nPlease enter your name : ");
        String name = in.nextLine();

        System.out.println("Hello, goodmorning " + name);

    }


}
