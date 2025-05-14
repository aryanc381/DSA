package questions.Loops;
import java.util.*;

// Input a number and print all the factors of that number (use loops).

public class Factors {
    public static void main(String[] args) {
        int num = 12;
        int[] arr = new int[num];
        for(int i = 1; i <=num; i++) {
            if(num % i == 0) {
                arr[i- 1] = i;
            }
        }
        System.out.println("\nTHE FACTORS OF " + num + " ARE : ");
        for (int i = 0; i < num; i++) {
            if(arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }    
}
