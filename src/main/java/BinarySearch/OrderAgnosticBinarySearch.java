package BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = {12,14,23,29,34,39,47,57,62,79,82,99};
        int[] arr2 = {99,87,70,67,55,48,34,22,11};
        int target = s.nextInt();

        System.out.println("Element found at : "+orderAgnosticBinarySearch(arr2, target));

        s.close();
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        // find whether the array is ascending or not
        boolean isAscending = arr[start] < arr[end];    // if we use start element, there might be possibility that start & start+1 are same.

        while(start<=end){      // loop until start becomes > end
            int mid = start + (end - start)/2 ;  // finding mid element (start+end)/2 might exceed in a case where size is large

            if (arr[mid] == target)
                return mid;

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;               // target is on left side of mid element
                } else {
                    start = mid + 1;            // target is on right side of mid element
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;               // target is on left side of mid element
                } else {
                    start = mid + 1;            // target is on right side of mid element
                }
            }
        }
        // element not found
        return -1;
    }
}
