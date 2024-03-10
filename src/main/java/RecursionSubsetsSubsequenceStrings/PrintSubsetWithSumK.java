package RecursionSubsetsSubsequenceStrings;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsetWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int targetSum = 4;
        List<Integer> subset = new ArrayList<>();
        subsetWithSumK(0, arr, targetSum, subset, 0);
    }

    private static void subsetWithSumK(int index, int[] arr, int targetSum, List<Integer> subset, int currSum) {
        if (targetSum== currSum){
            System.out.println(subset);
            return;
        }
        if (index == arr.length){
            return;
        }

        subset.add(arr[index]);
        subsetWithSumK(index+1, arr, targetSum, subset, currSum+arr[index]);

        subset.remove((Integer) arr[index]);
        subsetWithSumK(index+1, arr, targetSum, subset, currSum);
    }
}
