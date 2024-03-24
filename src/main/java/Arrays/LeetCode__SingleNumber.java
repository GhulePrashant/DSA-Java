package Arrays;

public class LeetCode__SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int[] arr2 = {2,2,1,3,1};
        System.out.println(singleNumber(arr2));
    }

    private static int singleNumber(int[] nums) {
        int xor = 0;
        int n = nums.length-1;

        for(int i = 0; i <= n; i++){
            xor = xor ^ nums[i];
        }

        return xor;
    }
}
