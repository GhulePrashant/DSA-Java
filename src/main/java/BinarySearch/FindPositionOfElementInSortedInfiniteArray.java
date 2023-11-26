package BinarySearch;

/**
 * Assume array is of infinite size.
 */
public class FindPositionOfElementInSortedInfiniteArray {

    /**
     * Approach :
     * In the binarySearch we divide the array in two parts depending on target < or > mid-element
     * Here, we'll start in reverse
     * first our box for search will be of 2 elements i.e. [0,1]
     * we'll double the box size until target > end
     * then apply binarySearch on that box.
     */
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,8,9,11,13,15,18,22,25,26,29,33,38,40,44,45,46,47,49,52,54,57,59,60,62,63,65,67,69,70,71,72,74,75,77,78};
        int target = 49;

        System.out.println(findingRange(arr, target));
    }


    private static int findingRange(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;     // newStart
            // double the range
            end = end + (end-start+1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }
    private static int binarySearch(int[] arr, int target, int start, int end) {
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
