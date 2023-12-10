package MathsAndBits;

public class FindUniqueInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        int unique = 0;
        for (int n : arr){
            unique = unique ^ n;
        }
        return unique;
    }
}
