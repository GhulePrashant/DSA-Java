package Sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * 448 Find All Numbers Disappeared in an Array
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [2]
 *
 *
 * Constraints:
 *
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 *
 *
 * Follow up: Could you do it without extra space and in O(n) runtime?
 * You may assume the returned list does not count as extra space.
 */
public class LeetCode__FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int[] arr2 = {1,1};
        System.out.println(findDisappearedNumbers(arr));
        System.out.println(findDisappearedNumbers(arr2));

    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int i = 0;

        while (i<nums.length){
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }

        for (int index = 0; index < nums.length ; index++){
            if (index+1 != nums[index])
                list.add(index+1);
        }
        return list;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
