package RecursionSubsetsSubsequenceStrings;

import java.util.ArrayList;
import java.util.List;

public class CountSubsetsWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int targetSum = 4;
        List<Integer> subset = new ArrayList<>();
        System.out.println("Count : "+subsetWithSumK(0, arr, targetSum, subset, 0));
    }

    private static int subsetWithSumK(int index, int[] arr, int targetSum, List<Integer> subset, int currSum) {
        if (targetSum== currSum){
            System.out.println(subset);
            return 1;
        }
        if (index == arr.length){
            return 0;
        }

        subset.add(arr[index]);
        int left = subsetWithSumK(index+1, arr, targetSum, subset, currSum+arr[index]);

        subset.remove((Integer) arr[index]);
        int right = subsetWithSumK(index+1, arr, targetSum, subset, currSum);

        return left+right;
    }
}
