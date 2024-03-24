package Arrays;

/**
 1752. Check if Array Is Sorted and Rotated

 https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

 Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

 There may be duplicates in the original array.

 Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

 Example 1:
 Input: nums = [3,4,5,1,2]
 Output: true
 Explanation: [1,2,3,4,5] is the original sorted array.
 You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].

 Example 2:
 Input: nums = [2,1,3,4]
 Output: false
 Explanation: There is no sorted array once rotated that can make nums.

 Example 3:
 Input: nums = [1,2,3]
 Output: true
 Explanation: [1,2,3] is the original sorted array.
 You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.

 Constraints:

 1 <= nums.length <= 100
 1 <= nums[i] <= 100
 */

public class LeetCode__CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,1,3,4};
        System.out.println(check(arr));
        System.out.println(check(arr1));
        System.out.println(check(arr2));
    }

    public static boolean check(int[] nums) {
        int flags = 0;

        for(int i=0; i< nums.length; i++){
            if(nums[i] > nums[(i+1) % nums.length]){
                flags += 1;
            }
        }

        return flags <=1;
    }
}
