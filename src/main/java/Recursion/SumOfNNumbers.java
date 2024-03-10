package Recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int n = 10;

        sumOfNNumbers(n, 0);
        System.out.println(sum(15));
    }

    private static void sumOfNNumbers(int n, int sum) {
        if (n < 1){
            System.out.println(sum);
            return;
        }

        sumOfNNumbers(n-1, n + sum);
    }

    private static int sum(int n){
        if (n==0){
            return 0;
        }

        return n + sum(n-1);
    }
}
