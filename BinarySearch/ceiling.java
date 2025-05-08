package BinarySearch;

import java.util.Arrays;

public class ceiling {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 6, 9};
        int target = 7;
        int ans1 = ceilingVal(array1, target);
        System.out.println("\nThe target is " + target + " and through binary search, the value just equal or bigger than that is: " + array1[ans1]);
        int ans2 = floorVal(array1, target);
        System.out.println("The target is " + target + " and through binary search of the value just equal or smaller than that is: " + array1[ans2]);
    }

    public static int ceilingVal(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        if (target > arr[arr.length - 1]) {
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
        return start;
    }

    public static int floorVal(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        if (target < arr[0]) {
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
        return end;
    }
}
