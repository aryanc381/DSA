package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        pattern1(4);
    }

    static void pattern1(int n) {
        System.out.println("\n");
        for(int rows = 1; rows <= n; rows++) {
            for(int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
