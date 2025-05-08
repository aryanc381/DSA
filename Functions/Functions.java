package Functions;

// functions in java are called as methods

import java.util.*;

public class Functions {
    public static void main(String[] args) {
        int ans = sum2(); 
        System.out.println(ans);

        String message = greet();
        System.out.println(message);

        int sumans = sum3(20, 30);
        System.out.println(sumans);
    }


    /*
     * 
     *   access modifier (OOP) return_type name(arguments) {
     *     // body
     *     return statement;
     * }
     * 
     */

     static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
     }

     static String greet() {
        String greeting = "How are you?";
        return greeting;
     }

    //     static void sum() {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter number 1 : ");
    //     int num1 = in.nextInt();
    //     System.out.println("Enter number 2 : ");
    //     int num2 = in.nextInt();

    //     int sum = num1 + num2;
    //     System.out.println("The sum of the two numbers is : " + sum );

    // } 
    
    static int sum3 (int a, int b) {
        int sum = a + b;
        return sum; 
    }

    static int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return a, b;
    } 
}
