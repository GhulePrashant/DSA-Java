package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode__TwoSum {
    public static void main(String[] args) {
        int[] nums = {11,8,10,7,15};
        System.out.println(Arrays.toString(twoSum(nums, 19)));
        System.out.println(twoSumBetter(nums, 19));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            Integer complementIndex = map.get(nums[i]);
            if(complementIndex != null){
                return new int[]{complementIndex, i};
            }
            map.put(target-nums[i], i);
        }
        return (new int[]{-1,-1});
    }

    private static String twoSumBetter(int[] arr, int target){
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if (sum == target){
                return "Yes";
            }else if (sum < target){
                left++;
            }else {
                right--;
            }
        }

        return "No";
    }
}
