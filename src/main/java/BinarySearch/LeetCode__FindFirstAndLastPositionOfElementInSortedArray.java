package BinarySearch;

import java.util.Arrays;

/**
 * Find First and Last Position of Element in Sorted Array
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 * Given an array of integers nums sorted in non-decreasing order,
 * find the starting and ending position of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 *
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums is a non-decreasing array.
 * -109 <= target <= 109
 */

public class LeetCode__FindFirstAndLastPositionOfElementInSortedArray {

    /**
     * Approach
     * As array is sorted, we'll use binarySearch.
     * We can call binarySearch twice, 1st for first position and 2nd time for last position
     * Instead of returning mid element, we'll save mid element in ans variable as a possible ans
     * And loop will continue until start<=end
     * in the condition where mid is found, we can add a flag to check if we're finding first or last position
     * for first position, we'll update our end = mid -1
     * for last position, we'll update start = mid + 1
     * we'll return ans
     */
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};

        // check for first occurrence
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            // check for last occurrence
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){      // loop until start becomes > end
            int mid = start + (end - start)/2 ;  // finding mid element (start+end)/2 might exceed in a case where size is large

            if (target <  nums[mid]){
                end = mid -1;               // target is on left side of mid element
            } else if (target > nums[mid]) {
                start = mid + 1;            // target is on right side of mid element
            }else {
                // potential ans found
                ans = mid;
                if (findStartIndex)
                    end = mid -1;
                else
                    start = mid + 1;
            }
        }
        // element not found
        return ans;
    }
}
