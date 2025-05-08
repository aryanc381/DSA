package questions.fundamentals;
import java.util.*;

// Input currency in rupees and output in USD. [3mins]

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter in ruppee: ");
        int rup = in.nextInt();

        System.out.println("Dollar conversion: " + rup / 85);

    }    
}
