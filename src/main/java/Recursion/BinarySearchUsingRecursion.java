package Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9,12,13,15,17};
        int target = 6;

        int ans = binarySearch(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start)/2;
        if (arr[mid] == target){
            return mid;
        }

        if (target > arr[mid]){
            return binarySearch(arr, target, mid+1, end);
        }

        return binarySearch(arr, target, start, mid-1);
    }
}
