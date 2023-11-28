package BinarySearch;

import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,10},    // 0th index
                {4,5,6,11},      // 1st index
                {7,8,9,12}
        };
        System.out.println(Arrays.toString(search(arr, 7)));
    }

    private static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr[row].length -1;   //arr.length    arr[row].lemgth     m

        while (row < arr.length && col >=0){
//            System.out.println(Arrays.toString(new int[]{row,col}));
            if (arr[row][col] == target)
                return new int[]{row,col};

            if (arr[row][col] < target)
                row++;
            else
                col--;

        }

        return new int[]{-1,-1};
    }
}
