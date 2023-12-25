package Recursion;

import java.util.ArrayList;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,5,5,3,18};

        int target = 5;

        System.out.println(linearSearch(arr, target, 0));
        linearSearchAll(arr, target, 0);
        System.out.println(list);
    }

    private static int linearSearch(int[] arr, int target, int i) {
        if (i == arr.length){
            return -1;
        }

        if (arr[i] == target){
            return i;
        }else {
            return linearSearch(arr, target, i+1);
        }

    }

    static ArrayList<Integer> list = new ArrayList<>();
    private static void linearSearchAll(int[] arr, int target, int i) {
        if (i == arr.length){
            return ;
        }

        if (arr[i] == target){
            list.add(i);
        }

        linearSearchAll(arr, target, i+1);
    }

}
