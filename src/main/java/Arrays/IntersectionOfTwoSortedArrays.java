package Arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6,7,8};

        System.out.println(intersection(arr, arr2));
    }

    private static List<Integer> intersection(int[] arr1, int[] arr2){
        List<Integer> ans = new ArrayList<>();
        int l1 = arr1.length;
        int l2 = arr2.length;
        int i = 0;
        int j = 0;

        while(i< l1 && j<l2){
            if(arr1[i] < arr2[j]){
                i++;
            }else if (arr1[i] > arr2[j]){
                j++;
            }else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
