package Arrays;

/**
 * 485. Max Consecutive Ones
 * https://leetcode.com/problems/max-consecutive-ones/description/
 *
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * Example 1:
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * Example 2:
 *
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 */

public class LeetCode__MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length-1;
        int max = 0;
        int count = 0;
        for(int i = 0; i<= len; i++){
            if(nums[i] == 0){
                count = 0;
            }else{
                count++;
                max = count>=max ? count : max;
            }
        }
        return max;
    }
}
