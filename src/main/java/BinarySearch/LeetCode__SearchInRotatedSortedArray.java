package BinarySearch;

/**
 * Search in Rotated Sorted Array
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 *
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * Example 3:
 *
 * Input: nums = [1], target = 0
 * Output: -1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 5000
 * -104 <= nums[i] <= 104
 * All values of nums are unique.
 * nums is an ascending array that is possibly rotated.
 * -104 <= target <= 104
 */

public class LeetCode__SearchInRotatedSortedArray {

    /**
     * Approach
     * 1. find the pivot element i.e. largest element
     *      [3,4,5,6,7,0,1,2] in this [7,0] is descending, rest all from pivot are in ascending,
     *      1. i.e. mid > mid+1 , mid will be pivot
     *      2. mid < mid-1 then mid-1 will be pivot
     * 2. binarySearch in first half --> start, pivot
     * 3. if not found in 2 then binarySearch in second half --> pivot +1 , end
     */
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1)
            return binarySearch(nums, target, 0, nums.length-1);

        if (nums[pivot] == target)
            return pivot;

        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }else
            return binarySearch(nums, target, pivot+1, nums.length-1);

    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1 ;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (mid < end && arr[mid] > arr[mid+1])
                return mid;

            if (mid > start && arr[mid] < arr[mid-1])
                return mid-1;

            if (arr[mid] <= arr[start])
                end = mid -1 ;
            else
                start = mid + 1;

        }

        return -1;
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
