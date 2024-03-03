package Sorting;

public class LeetCode__FirstMissingPositiveNumber {

    public static void main(String[] args) {
        int[] arr2 = {7,8,9,11,12};

        System.out.println(firstMissingPositive(arr2));
    }
    public static int firstMissingPositive(int[] nums) {
        // sort the array
        int i=0;

        while (i < nums.length){
            int correct = nums[i]-1;
            if (nums[i]>0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }

        // search element in sorted array
        for (int index = 0; index < nums.length; index++){
            if (index+1 != nums[index])
                return index+1;
        }
        return nums.length+1;

    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
