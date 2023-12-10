package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(printFibonacci(n));

    }


    private static int printFibonacci(int n) {
        if (n==0 || n==1)
            return n;

        int fib = 0;
        fib = printFibonacci(n-1) + printFibonacci(n-2);
        return fib;
    }
}
