package RecursionSubsetsSubsequenceStrings;

import java.util.ArrayList;
import java.util.List;

public class PrintFirstSubsetWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int targetSum = 4;
        List<Integer> subset = new ArrayList<>();
        subsetWithSumK(0, arr, targetSum, subset, 0);
    }

    private static boolean subsetWithSumK(int index, int[] arr, int targetSum, List<Integer> subset, int currSum) {
        if (targetSum== currSum){
            System.out.println(subset);
            return true;
        }
        if (index == arr.length){
            return false;
        }

        // pick the index
        subset.add(arr[index]);
        if(subsetWithSumK(index + 1, arr, targetSum, subset, currSum + arr[index])){
            return true;
        }

        // un-pick the index
        subset.remove((Integer) arr[index]);
        if (subsetWithSumK(index+1, arr, targetSum, subset, currSum)){
            return true;
        }

        return false;
    }
}
