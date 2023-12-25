package Recursion;

import java.util.ArrayList;

public class FindAllOccurrencesOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,7,9,3,3,3};
        int target = 7;
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(findAllOccurrencesOfNumber(arr,target,index,list));
    }

    private static ArrayList<Integer> findAllOccurrencesOfNumber(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index==arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        return findAllOccurrencesOfNumber(arr,target, index+1, list);

    }
}
