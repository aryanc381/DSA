package BinarySearch;



//ORDER AGNOSTIC BINARY SEARCH - WHEN WE DONT KNOW IF THE ARRAY IS IN ASCENDING OR DESCENDING ORDER 
public class orderAgnosticBin {
    public static void main(String[] args) {
        int[] arr= {10, 9 ,6 ,5, 1};
        int target = 6;
        int ans = orderAgnosticBS(arr, target);
        System.out.println("\nThe index of " + target + " is at location " + ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        // IF THE LENGTH OF ARRAY DOESNT HAVE ANY VALUE
        if(arr.length == 0) {
            return -1;
        }
        int mid = 0;
        int start = 0;
        int end = arr.length - 1;

        // FIND WHETHER ARR IS IN ASCENDING OR DESCENDING ORDER
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if(isAsc) {
                if(target > arr[mid]) {
                    start = mid + 1; 
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
