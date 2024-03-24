package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6,7,8};

//        union(arr, arr2);
        unionOptimal(arr, arr2);
    }

    private static void unionOptimal(int[] arr, int[] arr2) {
        List<Integer> unionList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < arr.length && j < arr2.length){
            if ((arr[i] < arr2[j]) && !unionList.contains(arr[i])){
                unionList.add(arr[i]);
                i++;
            } else if ((arr[i] > arr2[j]) && !unionList.contains(arr2[j])) {
                unionList.add(arr2[j]);
                j++;
            }else{
                if (!unionList.contains(arr[i])){
                    unionList.add(arr[i]);
                }
                i++;
                j++;
            }
        }

        while(i < arr.length){
            if (!unionList.contains(arr[i])){
                unionList.add(arr[i]);
            }
            i++;
        }

        while(j < arr2.length){
            if (!unionList.contains(arr2[j])){
                unionList.add(arr2[j]);
            }
            j++;
        }

        System.out.println(unionList);
    }

    private static void union(int[] arr, int[] arr2) {
        Set<Integer> set = new TreeSet<Integer>();

        for (int j=0; j< arr.length; j++) {
            set.add(arr[j]);
        }

        for (int i =0; i< arr2.length; i++) {
            set.add(arr2[i]);
        }

        for (Integer i : set){
            System.out.println(i);
        }
    }
}
