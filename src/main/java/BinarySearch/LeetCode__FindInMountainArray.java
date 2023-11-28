package BinarySearch;

public class LeetCode__FindInMountainArray {

    /**
     * Find peak element
     * then search in left part
     * if not found in left part, search in right part
     */

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println(search(nums, target));
    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr,target, 0, peak);
        if (firstTry != -1)
            return firstTry;

        return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

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

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]){
                // descending part of array
                end = mid ;
            }else{
                // ascending part of array
                // need to look in right side hence
                start = mid + 1;
            }
        }

        // start and end are finding the largest element in the above two checks
        // start == end will be our ans, hence we can return start or end
        return start;
    }
}
