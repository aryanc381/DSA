package questions.fundamentals;
import java.util.*;

// To calculate Fibonacci Series up to n numbers. [concept understood][13mins]

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter n: ");
        int n = in.nextInt();
        int[] ans = fibonacci(n);
        System.out.println("\n The fibonnaci series till " + n + " is " + Arrays.toString(ans));
    }

    static int[] fibonacci(int num) {
        int[] arr = new int[num];
        int sum = 0;
        if (num > 0) arr[0] = 0;
        if (num > 1) arr[1] = 1;
        for(int i =2; i < num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
}
