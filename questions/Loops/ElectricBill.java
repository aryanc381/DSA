package questions.Loops;
import java.util.*;
// Given the number of electricity units consumed, compute the total bill amount based on a tiered pricing structure.

public class ElectricBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter units: ");
        int units = in.nextInt();

        int total = 0;
        if(units >= 300) {
            total = 1000 + 1500 + 2000 + ((units % 100) * 25);
        } else if (units >= 200 && units < 300) {
            total = 1000 + 1500 + ((units % 100) * 20);
        } else if (units >=100 && units < 200) {
            total = 1000 + ((units % 100) * 15);
        } else {
            total = 10 * units;
        }

        System.out.printf("The total of the electric bill is: " + total);
    }    
}
