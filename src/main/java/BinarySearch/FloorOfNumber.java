package BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        int target = 15;

        System.out.println("Ceiling : "+ floor(arr, target));
    }


    // index of greatest number smaller than or equal to target
    private static int floor(int[] arr, int target) {
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
        return end;   // when exact target is not found, end will be the ans
    }
}
