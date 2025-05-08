package questions;
import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int og_num = num;
        int count = 0;

        while(num > 0) {
            int i = num % 10;
            if (i == 7) {
                count += 1;
            }
            num /= 10; 
        }
        System.out.println("The occurance of 7 is " + count + " times in " + og_num);
    }    
}
