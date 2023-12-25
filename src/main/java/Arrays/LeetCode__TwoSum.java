package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode__TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 18)));
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
}
