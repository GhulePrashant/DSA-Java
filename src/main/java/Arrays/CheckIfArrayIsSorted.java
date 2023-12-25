package Arrays;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8};
        System.out.println(isArraySorted(arr));
    }

    static boolean isArraySorted(int[] arr){
        for (int i = 1; i < arr.length ; i++){
            if (arr[i] >= arr[i-1]){

            }else {
                return false;
            }
        }
        return true;
    }
}
