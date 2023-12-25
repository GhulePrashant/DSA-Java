package Recursion;

public class FindIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9,12};

        System.out.println(isSorted(arr,0));
    }

    private static boolean isSorted(int[] arr, int i) {

        if (i==arr.length-1){
            return true;
        }

        return arr[i] < arr[i+1] && isSorted(arr, i+1);
    }
}
