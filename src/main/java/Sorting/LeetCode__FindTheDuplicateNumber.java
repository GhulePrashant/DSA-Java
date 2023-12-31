package Sorting;

/**
 * 287 Find the Duplicate Number
 * https://leetcode.com/problems/find-the-duplicate-number/description/
 *
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 *
 * There is only one repeated number in nums, return this repeated number.
 *
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 *
 * Example 1:
 *
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 * Example 2:
 *
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 *
 * Constraints:
 *
 * 1 <= n <= 105
 * nums.length == n + 1
 * 1 <= nums[i] <= n
 * All the integers in nums appear only once except for precisely one integer which appears two or more times.
 *
 * Follow up:
 *
 * How can we prove that at least one duplicate number must exist in nums?
 * Can you solve the problem in linear runtime complexity?
 */

public class LeetCode__FindTheDuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int[] arr2 = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate(arr2));

    }
    public static int findDuplicate(int[] nums) {
        int i=0;

        while(i<nums.length){
            int correct = nums[i] - 1;

            if(nums[correct] != nums[i]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                return nums[index];
            }
        }
        return -1;
    }

    public static int findDuplicate2(int[] nums) {
        int i=0;

        while(i<nums.length){
            if (nums[i] != i+1) {
                int correct = nums[i] - 1;

                if (nums[correct] != nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    return nums[i];
                }
            }else {
                i++;
            }
        }

        return -1;
    }
}
