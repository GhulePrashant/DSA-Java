package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DIntroduction {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
        */

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][]; // row size is mandatory, column size is not mandatory at this level.

        int[][] arr2 = {
                {1,2,3},    // 0th index
                {4,5},      // 1st index
                {6,7,8,9}   //2nd index --> arr2[2] = {6,7,8,9}
        };

        int[][] num = new int[3][3];
        System.out.println(num.length); // number of rows

        //input for 2d array
        for (int row=0; row< num.length; row++){
            //for each column
            for(int col=0; col<num[row].length; col++){
                num[row][col] = in.nextInt();
            }
        }

        //output in different ways

        for (int row=0; row< num.length; row++){
            //for each column
            for(int col=0; col<num[row].length; col++){
                System.out.print(num[row][col]+" ");
            }
            System.out.println();
        }

        for (int row=0; row<num.length; row++){
            System.out.println(Arrays.toString(num[row]));
        }

        for (int[] arr3 : num){
            System.out.println(Arrays.toString(arr3));
        }

    }
}
