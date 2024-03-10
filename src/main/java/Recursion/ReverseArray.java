package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        reverseArray(0, arr.length-1, arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int start, int end, int[] arr) {
        if (start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(start+1, end-1, arr);
    }
}
