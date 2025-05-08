package questions.fundamentals;
import java.util.*;
// To find out whether the given String is Palindrome or not. [concept revised][15mins]

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter string: ");
        String idk = in.nextLine();
        int n = idk.length();
        boolean isPalindrome = true;
        for(int i = 0; i < n; i++) {
            if(idk.charAt(i) != idk.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
