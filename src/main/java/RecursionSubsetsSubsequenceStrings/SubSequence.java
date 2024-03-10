package RecursionSubsetsSubsequenceStrings;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
//        subSequence("", "abc");
        int[] arr = {3, 1, 2};
        subset(0, arr, arr.length, new ArrayList<Integer>());
    }

    static void subSequence(String proc, String unProc){
        if (unProc.isEmpty()){
            System.out.println(proc);
            return;
        }

        char ch = unProc.charAt(0);

        subSequence(proc + ch , unProc.substring(1));
        subSequence(proc, unProc.substring(1));
    }

    static void subset(int index, int[] arr, int length, List<Integer> ans){
        if (index == length){
            System.out.println(ans);
//            printList(ans);
            return;
        }
        // pick particular index into subset
        ans.add(arr[index]);
        subset(index+1, arr, length, ans);

        // remove the picked index
        ans.remove((Integer) arr[index]);
        subset(index+1, arr, length, ans);
    }

    private static void printList(List<Integer> ans) {
        for (int i : ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
