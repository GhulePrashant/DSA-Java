package Sorting;

public class LeetCode__FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,0,6,4,2};

        System.out.println(missingNumber(arr));

    }

    static int missingNumber(int[] nums) {
        // sort the array
        int i=0;

        while (i < nums.length){
            if (nums[i] < nums.length && nums[i] != i){
                swap(nums, i, nums[i]);
            }else {
                i++;
            }
        }

        // search element in sorted array
        for (int index = 0; index < nums.length; index++){
            if (index != nums[index])
                return index;
        }
        return nums.length;

    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
