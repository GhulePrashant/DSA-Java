package RecursionSubsetsSubsequenceStrings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubsetWithSumK {
    public static void main(String[] args) {
        int[] arr = {6,2,3,1,1,1,1,3,3};
        int[] arr2 = {-1,0,2,1,3};
        longestSubsetWithSumKOptimal(arr, 6);
    }

    private static void longestSubsetWithSumK(int[] arr, int targetSum){
        int longestSubset = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j< arr.length; j++){
                int sum = 0;
                for (int k = i; k <=j; k++){
                    sum += arr[k];
                }
                if (targetSum == sum){
                    longestSubset = Math.max(longestSubset, j-i+1);
                }
            }
        }

        System.out.println("Longest Subset : "+longestSubset);
    }

    private static void longestSubsetWithSumKBetter(int[] arr, int targetSum){
        int longestSubset = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j< arr.length; j++){
                sum += arr[j];
                if (targetSum == sum){
                    longestSubset = Math.max(longestSubset, j-i+1);
                }
            }
        }

        System.out.println("Longest Subset : "+longestSubset);
    }

    private static void longestSubsetWithSumKBetter2(int[] arr, int targetSum){
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (sum == targetSum){
                maxLen = Math.max(maxLen, i+1);
            }
            int rem = sum - targetSum;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        System.out.println("Ans : "+maxLen);
    }

    private static void longestSubsetWithSumKOptimal(int[] arr, int targetSum){
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int sum = arr[0];

        while(right <= arr.length-1){
            while(left <= right && sum > targetSum){
                sum -= arr[left];
                left++;
            }

            if (sum == targetSum){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
            if (right < arr.length){
                sum += arr[right];
            }

        }
        System.out.println("Len : "+ maxLen);
    }
}
