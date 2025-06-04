package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(4);
        pattern5correct(4);
    }

    static void pattern5(int n) {
        System.out.println("\nPattern 5 original attempt\n");
        int rows = 1;
        for(rows = 1; rows <= (2*n - 1); rows++) {
            if(rows <= n) {
                for(int cols = 1; cols <= rows; cols++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                for(int cols = n - (n - rows); cols > 0; cols--) {
                    System.out.print("* ");
                }
                System.out.println(); 
            }
        }
    }

    static void pattern5correct(int n) {
        System.out.println("\n\nPatter 5 correction \n");
        for(int i = 0; i <= (2 * n - 1); i++) {
            int stars;

            if (i<=n) {
                stars = i;
            } else {
                stars = 2*n-i;
            }

            for(int j = 1; j<= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
