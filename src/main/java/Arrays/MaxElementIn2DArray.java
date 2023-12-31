package Arrays;

public class MaxElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3,6,9},
                {14,19},
                {27,24,23,29}
        };

        System.out.println(maxElement(arr));
    }

    private static int maxElement(int[][] arr) {
        int max = arr[0][0];
        for (int[] row : arr){
            for (int element : row){
                if (element > max)
                    max = element;
            }
        }
        return max;
    }
}
