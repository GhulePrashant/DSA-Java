package Sorting;

import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,2,9,4,6,8};
        int[] sortArr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {3,4,-1,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(sortArr));

    }

    private static void cycleSort(int[] arr) {
        int i = 0;

        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[correctIndex] != arr[i]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
