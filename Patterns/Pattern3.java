package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(4);
    }

    static void pattern3(int n) {
        System.out.println("\n");

        for(int rows = 1; rows <= n; rows++) {
            for(int cols = n - rows + 1; cols > 0; cols--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
