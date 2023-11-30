package Sorting;

import java.util.Arrays;

public class LeetCode__SetMismatchFindErrorNum {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] arr2 = {1,1};
        System.out.println(Arrays.toString(findErrorNums(arr)));
        System.out.println(Arrays.toString(findErrorNums(arr2)));

    }
    public static int[] findErrorNums(int[] nums) {
        int i=0;

        while(i<nums.length){
            int correct = nums[i]-1;

            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                return new int[]{nums[index], index+1};
            }
        }
        return new int[]{};
    }
}
