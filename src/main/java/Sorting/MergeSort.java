package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr){
        // base condition
        // we will keep dividing array until there is only one element left and then we'll return array
        if (arr.length == 1){
            return arr;
        }

        // finding mid element
        int mid = arr.length / 2 ;

        // calling recursively for left and right parts of array
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // merging the arrays
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if (left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            mix[k] = left[j];
            j++;
            k++;
        }
        return mix;
    }
}
