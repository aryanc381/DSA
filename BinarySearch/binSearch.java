package BinarySearch;

public class binSearch {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 6, 9};
        int target = 9;
        int ans = binarySearch(array1, target);
        System.out.println("The location of " + target + " through binary search is: " + ans);
    }

    public static int binarySearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        int mid = 0;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            mid = (start + end) / 2;

            if(target == arr[mid]) {
                return mid;
            }
            else if(target > arr[mid]) {
                start = mid + 1; 
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
