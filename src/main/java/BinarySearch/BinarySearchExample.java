package BinarySearch;

import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = {12,14,23,29,34,39,47,57,62,79,82,99};

        int target = s.nextInt();

        System.out.println("Element found at : "+binarySearch(arr, target));

        s.close();
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        
        while(start<=end){      // loop until start becomes > end
            int mid = start + (end - start)/2 ;  // finding mid element (start+end)/2 might exceed in a case where size is large
            
            if (target < arr[mid]){
                end = mid -1;               // target is on left side of mid element
            } else if (target > arr[mid]) {
                start = mid + 1;            // target is on right side of mid element
            }else {
                // element found
                return mid;
            }
        }
        // element not found
        return -1;
    }
}
