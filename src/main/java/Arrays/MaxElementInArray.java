package Arrays;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {23,76,34,65,58};

        System.out.println(maxElement(arr));
        System.out.println(maxElementInRange(arr,2,4));
    }

    private static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


    private static int maxElementInRange(int[] arr, int start, int end) {

        if (start > end)
            return  -1;

        if (arr == null || arr.length ==0)
            return -1;

        if (arr.length ==1)
            return arr[0];
        else {
            int max = arr[0];
            for (int i = start; i <= end; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }
}
