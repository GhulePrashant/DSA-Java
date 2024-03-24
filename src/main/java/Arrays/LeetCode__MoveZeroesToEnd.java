package Arrays;

import java.util.Arrays;

/**
 283. Move Zeroes
 https://leetcode.com/problems/move-zeroes/description/

 Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 Note that you must do this in-place without making a copy of the array.



 Example 1:

 Input: nums = [0,1,0,3,12]
 Output: [1,3,12,0,0]
 Example 2:

 Input: nums = [0]
 Output: [0]


 Constraints:

 1 <= nums.length <= 104
 -231 <= nums[i] <= 231 - 1


 Follow up: Could you minimize the total number of operations done?
 */

public class LeetCode__MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeroes(int[] nums) {
        int nr_zero=0;
        int n=nums.length;
        int index=-1;
        for(int i=0;i<n;i++){
            if(nums[i]!=0) // super optim
                nums[++index]=nums[i];
        }
        for(int i=index+1;i<n;i++)
            nums[i]=0;
    }
}
