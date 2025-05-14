package questions.Loops;
import java.util.*;

// Volume of different types of prisms.

public class VolumePrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        while(choice != 4) {
            System.out.println("\n1. Triangular Prism");
            System.out.println("2. Rectangular Prism");
            System.out.println("3. Basic Prism");
            System.out.println("4. Exit");
            System.out.println("Enter your choice (1-3) : ");
            choice = in.nextInt();

            if (choice == 4) {
                System.out.println("EXITING...");
                break;
            }
            System.out.print("\nEnter length: ");
            int length = in.nextInt();
            System.out.print("\nEnter width: ");
            int width = in.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Triangular Prism Area: ");
                    break;
                case 2:
                    System.out.println("Rectangular Prism: " + rectPrism(length, width));
                    break;
                case 3: 
                    System.out.println("Basic Prism: " + Prism(length));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong choice, try again");
                    break;
            }
        }
    }

    static int rectPrism(int l, int w) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter height: ");
            int h = in.nextInt();
            int area = l * w * h;
            return area;
    }

    static int Prism(int l) {
        System.out.println("Enter base: ");
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        System.out.println("Enter height: ");
        int h = in.nextInt();

        int area = b * h;
        return area;
    }


}
