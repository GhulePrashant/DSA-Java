package Arrays;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,6,7,8,9};
        System.out.println(findSecondLargest(arr));
    }

    static int findSecondLargest(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        if (arr.length == 1){
            return arr[0];
        }
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i= 1; i < arr.length; i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if (arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;

    }
}
