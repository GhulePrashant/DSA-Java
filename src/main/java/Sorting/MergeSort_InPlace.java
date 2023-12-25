package Sorting;

import java.util.Arrays;

public class MergeSort_InPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int s, int e){
        // base condition
        // we will keep dividing array until there is only one element left and then we'll return array
        if (e-s == 1){
            return;
        }

        // finding mid element
        int mid = (s + e) / 2 ;

        // calling recursively for left and right parts of array
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        // merging the arrays
        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while(i < mid && j < e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l<mix.length; l++){
            arr[s + l] = mix[l];
        }
    }
}
