package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class LeftRotateArrayByKPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(leftRotateByKPlaces(arr, k, arr.length)));
    }

    private static int[] leftRotateByKPlaces(int[] arr, int k, int length) {
        reverse(arr, 0, k-1);
        reverse(arr, k, length-1);
        reverse(arr, 0, length-1);

        return arr;
    }

    private static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
