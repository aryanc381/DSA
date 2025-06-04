package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        pattern4a(4);
        pattern4b(4);
        pattern4c(4);
    }

    static void pattern4a(int n) {
        System.out.println();
        for(int rows = 1; rows <= n; rows++) {
            for(int cols = 1; cols <= rows; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    static void pattern4b(int n) {
        System.out.println();
        for(int rows= 1; rows <=n; rows++) {
            for(int cols = n - rows + 1; cols > 0; cols--) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    static void pattern4c(int n) {
        System.out.println();
        for(int rows= 1; rows <=n; rows++) {
            for(int cols = n - rows + 1; cols > 0; cols--) {
                System.out.print((n - cols) + " ");
            }
            System.out.println();
        }
    }
}
