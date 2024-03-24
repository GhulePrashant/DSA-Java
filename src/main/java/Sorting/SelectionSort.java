package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,2,9,4,6,8};
        int[] sortArr = {1,2,3,4,5,6,7,8,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(sortArr));

    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int min = i;

            for (int j = i; j <=n-1; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}


