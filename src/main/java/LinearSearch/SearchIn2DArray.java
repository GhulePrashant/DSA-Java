package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3,6,9},
                {14,19},
                {27,24,23,29}
        };
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target){
        for (int row=0; row < arr.length; row++){
            for (int col=0; col <arr[row].length ; col++){
                if (target == arr[row][col])
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
