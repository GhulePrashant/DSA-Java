package LinearSearch;

import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = {10,15,27,19,36,49,95,87,57};
        System.out.println("Enter a number to search : ");
        int target = scanner.nextInt();
        System.out.println(linearSearch(num, target));
    }

    // search in the array
    // return the index if item found
    // return -1 if not found
    static int linearSearch(int[] arr, int target){
        if (arr.length ==0)
            return -1;

        for (int index=0; index< arr.length; index++){
            if (target == arr[index])
                return index;
        }
        // if no element is found this will execute
        return -1;
    }
}
