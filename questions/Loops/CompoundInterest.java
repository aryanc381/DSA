package questions.Loops;
import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.print("Enter principal amount : ");     int p = in.nextInt();
        System.out.print("Enter annual interest rate : "); int r = in.nextInt();
        System.out.print("Enter time (in years) : ");      int t = in.nextInt();
        System.out.print("Enter number of times interest is compounded : ");      int n = in.nextInt();

        double a = p * (1 + (r / n));
        double b = (n*t);
        double c = Math.pow(a, b);
        System.out.println("THE COMPOUND INTEREST IS : " + c);;
    }
}
