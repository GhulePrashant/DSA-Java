package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,2,9,4,6,8};
        int[] sortArr = {1,2,3,4,5,6,7,8,9};
        selectionSort(sortArr);
        System.out.println(Arrays.toString(sortArr));
//        System.out.println(Arrays.toString(sortArr));

    }

    static void selectionSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int max = maxElementInRange(arr,0,last);
            swap(arr,max, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int maxElementInRange(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = i;
            }
        }
        return max;
    }
}


