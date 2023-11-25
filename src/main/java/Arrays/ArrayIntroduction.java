package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntroduction {
    public static void main(String[] args) {

        //array of primitive
        int[] arr ; // declaration of array. arr getting defined in stack
        arr = new int[5]; // initialization , object created in heap area

//        Array elements are initialized to 0 by default.
        System.out.println(arr[0]);

        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 56;
        arr[3] = 7;
        arr[4] = 120;

        System.out.println(arr[3]);

        // input using Scanner class
//        Scanner scan = new Scanner(System.in);

//        for (int i=0; i< arr.length; i++){
//            arr[i] = scan.nextInt();
//        }
//
//        // printing array using for-each
//        for (int k: arr)
//            System.out.println(k);

        //printing array using for
//        for (int i=0; i<arr.length; i++)
//            System.out.println(arr[i]);
//
//        //printing array using Arrays class
//        System.out.println(Arrays.toString(arr));

        // array of objects/string
//        String[] str = new String[3];
//        for (int i=0; i<str.length; i++)
//            str[i] = scan.next();
//
//        System.out.println(Arrays.toString(str));

        int[] nums = {2,5,9};
        System.out.println(Arrays.toString(nums));

        updateArray(nums);

        System.out.println(Arrays.toString(nums));

    }

    private static void updateArray(int[] nums) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i< nums.length; i++){
            nums[i] = scanner.nextInt();
        }
    }
}