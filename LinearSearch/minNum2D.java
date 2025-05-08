    package LinearSearch;

import java.util.Arrays;

// SEARCH SMALLEST NUMBER IN 2D ARRAYS
    public class minNum2D {
        public static void main(String[] args) {
            int[][] numbers = {
                {10, 30, 412},
                {16, 80, 2}
            };
            int ans = twoD(numbers);
            int indexVal[] = indextwoD(numbers);
            System.out.println("\nThe smallest value in the two dimensional array is: " + ans + " " + " at location: " + Arrays.toString(indexVal));
        }
        // RETURNING THE SMALLEST ELEMENT 
        static int twoD(int[][] vals) {
            if(vals.length == 0) {
                return -1;
            }
            int rows = 0;
            int cols = 0;
            int ans = vals[rows][cols];
            for(rows = 0; rows < vals.length; rows++) {
                for(cols = 0; cols < vals[rows].length; cols++) {
                    if(vals[rows][cols] < ans) {
                        ans = vals[rows][cols];
                    }
                }
            }
            return ans;
        }

        // RETURNING THE INDEX OF THE SMALLEST ELEMENT
        static int[] indextwoD(int[][] vals) {
            int rows = 0;
            int cols = 0;
            int minRow = 0;
            int minCol = 0;
            int ans = vals[0][0];
            if(vals.length == 0) {
                return new int[] {-1, -1};
            }
            for(rows = 0; rows < vals.length; rows++) {
                for(cols = 0; cols < vals[rows].length; cols++) {
                    if(vals[rows][cols] < ans) {
                        ans = vals[rows][cols];
                        minRow = rows + 1;
                        minCol = cols + 1;
                    }
                }
            }
            return new int[]{minRow, minCol};

        }
    }
