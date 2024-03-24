package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode__RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArrayOptimal(arr)));
    }

    private static int[] rearrangeArrayOptimal(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int posIndex = 0, negIndex = 1;

        for(int i = 0; i<n; i++){
            if(nums[i] > 0){
                ans[posIndex] = nums[i];
                posIndex += 2;
            }else{
                ans[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return ans;
    }

    private static int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            if(nums[i] > 0){
                positive.add(nums[i]);
            }else{
                negative.add(nums[i]);
            }
        }

        for(int i=0,j=0; i<n; i += 2,j++){
            ans[i] = positive.get((Integer)j);
        }

        for(int i=1,j=0; i<n; i += 2,j++){
            ans[i] = negative.get((Integer)j);
        }
        return ans;
    }
}
