package BinarySearch;

/**
 * https://leetcode.com/problems/find-peak-element/
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * Same solution can be used for both problems
 *
 * 852. Peak Index in a Mountain Array
 *
 * Medium
 * An array arr is a mountain if the following properties hold:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
 *
 * You must solve it in O(log(arr.length)) time complexity.
 *
 * Example 1:
 * Input: arr = [0,1,0]
 * Output: 1
 *
 * Example 2:
 * Input: arr = [0,2,1,0]
 * Output: 1
 *
 * Example 3:
 * Input: arr = [0,10,5,2]
 * Output: 1
 *
 * Constraints:
 *
 * 3 <= arr.length <= 105
 * 0 <= arr[i] <= 106
 * arr is guaranteed to be a mountain array.
 */

public class LeetCode__PeakIndexInMountainArray {
    /**
     * Approach
     *
     * we'll use binarySearch for this
     * [0,10,5,2] 10 is ans, left side of 10 is ascending and right side is descending
     * if arr[mid] > arr[mid +1] --> you're in descending side
     * then end = mid for checking left side
     * if arr[mid] < arr[mid + 1] --> you're in ascending part
     * then start = mid + 1 for checking in right side
     * when will loop break ?
     * start==end will be the ans, so loop will run till start<end
     */
    public static void main(String[] args) {
        int[] nums = {5,7,8,10,6,4,3};

        System.out.println(peakIndexInMountainArray(nums));
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
