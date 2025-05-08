package LinearSearch;
import java.util.*;


// TO FIND A NUMBER IN A 2D ARRAY
public class searchtwoD {
    public static void main(String args[]) {
        int[][] array1 = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34}
        };
        int target = 3;
        int[] answer1 = twoSearch(array1, target);
        System.out.println("\nThe number " + target + " is found at location " + Arrays.toString(answer1));
    }

    public static int[] twoSearch(int[][] arr, int targ) {
        for(int row =0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == targ) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}


// TO FIND MAX/MIN NUMBER IN 2D ARRAY