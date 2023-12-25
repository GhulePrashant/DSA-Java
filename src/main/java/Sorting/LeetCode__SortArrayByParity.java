package Sorting;

import java.util.Arrays;

/**
 * 905. Sort Array By Parity

 https://leetcode.com/problems/sort-array-by-parity/description/

 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 *
 * Return any array that satisfies this condition.
 *
 * Example 1:
 *
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 * Constraints:
 *
 * 1 <= nums.length <= 5000
 * 0 <= nums[i] <= 5000
 */

public class LeetCode__SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int[] nums2 = {0};
        int[] nums3 = {3,1,2,4};
        int[] nums4 = {2,4,6,8};
        int[] nums5 = {2,4,3,8};
        System.out.println(Arrays.toString(sortArrayByParity2(nums)));
        System.out.println(Arrays.toString(sortArrayByParity2(nums2)));
        System.out.println(Arrays.toString(sortArrayByParity2(nums3)));
        System.out.println(Arrays.toString(sortArrayByParity2(nums4)));
        System.out.println(Arrays.toString(sortArrayByParity2(nums5)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;

        while (i < j){
            if (nums[i] % 2 == 0){
                i++;
            }else if ((nums[i] % 2) != 0 && nums[j] % 2 == 0){
                swap(nums, i, j);
                i++;
                j--;
            }else{
                j--;
            }
        }

        return nums;
    }

    public static int[] sortArrayByParity2(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r){
            if ((nums[l] & 1) == 1){
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                r--;
            } else l++;
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
