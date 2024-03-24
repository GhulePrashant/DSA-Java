package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LeetCode__MajorityElement {
    public static void main(String[] args) {
        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(majorityElementOptimal(arr));
    }

    /**
     Moore's Voting Algorithm
     */
    private static int majorityElementOptimal(int[] arr){
        int element = arr[0];
        int count = 0;
        int n = arr.length;
        for (int i = 0; i<n; i++){
            if (count == 0){
                count = 1;
                element = arr[i];
            }else if (arr[i] == element){
                count++;
            }else {
                count--;
            }
        }
        // assuming array will have an element which appears always > n/2
        // if this is not mentioned, loop through array and count freq of element and validate then return
        return element;
    }
    private static int majorityElement(int[] nums) {
        for(int i = 0; i< nums.length; i++){
            int count = 0;
            for(int j = 0; j< nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length/2){
                return nums[i];
            }
        }
        return nums[0];
    }

    private static int majorityElementUsingMap(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = freq.getOrDefault(nums[i], 0);
            freq.put(nums[i], value+1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if (entry.getValue() > n/2){
                return entry.getKey();
            }
        }

        return nums[0];
    }
}


