package Arrays;

import java.util.Arrays;

 /**
 75. Sort Colors
 https://leetcode.com/problems/sort-colors/description/

 Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

 We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

 You must solve this problem without using the library's sort function.

 Example 1:
 Input: nums = [2,0,2,1,1,0]
 Output: [0,0,1,1,2,2]

 Example 2:
 Input: nums = [2,0,1]
 Output: [0,1,2]

 Constraints:
 n == nums.length
 1 <= n <= 300
 nums[i] is either 0, 1, or 2.

 Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 */

public class LeetCode__SortArrayWith012 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};

//        sortArray(arr);
        sortArrayWithDutchNationalFlagAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i=0; i< arr.length; i++){
            if (arr[i] == 0){
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            }else {
                count2++;
            }
        }

        for (int i = 0; i<=count0-1; i++){
            arr[i] = 0;
        }
        for (int i = count0; i<=count0+count1-1; i++){
            arr[i] = 1;
        }
        for (int i = count0+count1; i< arr.length; i++){
            arr[i] = 2;
        }
    }

    /**
     * Dutch National Flag algo
     *
     * TC : O(N)
     * SC : O(1)
     */
    private static void sortArrayWithDutchNationalFlagAlgo(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if (arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
