package BinarySearch;

/**
 * Ceiling = smallest element in array greater or equal to target
 */
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        int target = 18;

        System.out.println("Ceiling : "+ceiling(arr, target));
    }


    // index of smallest number greater than or equal to target
    private static int ceiling(int[] arr, int target) {
        int start=0;
        int end = arr.length - 1;

        //if the target is greater than the greatest number in array
        if (target > arr[end])
            return -1;

        while(start <= end){
            int mid = start + (end - start)/2 ;

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return start;   // when exact target is not found, start will be the ans
    }
}
