package StringsBuild;

public class Difference {
    public static void main(String[] args) {
        String a = "Aryan"; 
        String b = "Aryan"; // both of these strings point to the same object.

        String c = new String("I dont know!"); // creating the same string but as a different object
        String d = new String("I dont know!");

        System.out.println("\nComparing the value of a and b: " + (a == b));
        System.out.println("Comparing the value of c and d: " + (c == d)); // checks whether they point to the same object. 

        System.out.println("Comparing the object of a and b: " + a.equals(b)); // only checks th value of the string.
        System.out.println("Comparing the object of c and d: " + c.equals(d));

        System.out.printf("Formatted number is %.2f", 28.19827);
        System.out.printf("Hello my name is %s and I am very %s", "Aryan", "cool");
    }
}
