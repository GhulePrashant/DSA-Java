package Arrays;

/**
 53. Maximum Subarray
 https://leetcode.com/problems/maximum-subarray/description/

 Given an integer array nums, find the
 subarray
 with the largest sum, and return its sum.

 Example 1:
 Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 Output: 6
 Explanation: The subarray [4,-1,2,1] has the largest sum 6.

 Example 2:
 Input: nums = [1]
 Output: 1
 Explanation: The subarray [1] has the largest sum 1.

 Example 3:
 Input: nums = [5,4,-1,7,8]
 Output: 23
 Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

 Constraints:
 1 <= nums.length <= 105
 -104 <= nums[i] <= 104

 Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class LeetCode__MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr2 = {-2,-1};
        System.out.println(printMaximumSubArraySum(arr));
    }

    /**
     * T.C. O(n*n)
     * S.C. O(1)
     */
    private static int maximumSubArraySumBrute(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        if (n==1){
            return arr[0];
        }
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum += arr[j];
                maxSum = (sum > maxSum) ? sum : maxSum;
            }
        }
        return maxSum;
    }

    private static int maximumSubArraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++){
            sum += arr[i];

            maxSum = (sum > maxSum) ? sum : maxSum;

            if (sum < 0){
                sum = 0;
            }
        }

        return maxSum;
    }

    private static int printMaximumSubArraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int n = arr.length;
        int ansStart = 0, ansEnd=0, start = 0;
        for (int i = 0; i < n; i++){
            if (sum == 0){
                start = i;
            }
            sum += arr[i];

            if (sum > maxSum){
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0){
                sum = 0;
            }
        }
        System.out.println(ansStart +"<->"+ansEnd);
        return maxSum;
    }
}
