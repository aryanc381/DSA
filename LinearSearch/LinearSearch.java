package LinearSearch;
import java.util.*;


public class LinearSearch {
    // MAIN CODE
    public static void main(String args[]) {
        // FINDING THE TARGET NUMBER
        int array1[] = {23, 45, 1, 2, 3, 5, 6};
        int target = 2;
        int ans = linearSearch(array1, target, 1, array1.length);
        System.out.println("\nThe " + target + " is found in the array at the location " + ans);

        // FINDING THE CHARACTER IN A STRING
        String s1 = "Aryan";
        char target1 = 'z';
        System.out.println(search(s1, target1)); 

        // FINDING THE MINIMUM NUMBER
        int[] array2 = {18, 12, -7, 3, 14, 28};
        System.out.println("The minimum number is :" + min(array2));
    }    
 
    // LINEAR SEARCH FOR NUMBERS
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for(int index = start; index < end; index++) {
            int element = arr[index];
            if( element == target) {
                return index;
            }
        }
        return -1;
    }

    // LINEAR SEARCH FOR STRINGS
    static boolean search(String s1, char target1) {
        
        if (s1.length() == 0) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (target1 == s1.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    // TO FIND THE MINIMUM NUMBER
    static int min(int[] arr) {
        int ans = arr[0];
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] < ans) {
                ans = arr[index];
            }
        }
        return ans;
    }
}
