package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,2,9,4,6,8};
        int[] sortArr = {1,2,3,4,5,6,7,8,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(sortArr));

    }

    static void bubbleSort(int[] arr){

        boolean swap;
        // run steps n-1 times
        for (int i = 0; i< arr.length; i++){
            swap = false;
            // for each step, largest item will come at last respective index
            for (int j=1; j< arr.length-i; j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
//                System.out.println(Arrays.toString(arr));
            }

            if (!swap)
                break;
        }
    }
}
