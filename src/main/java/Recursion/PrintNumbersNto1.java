package Recursion;

public class PrintNumbersNto1 {
    public static void main(String[] args) {
        int n = 10;

        printNumber(n);
    }

    private static void printNumber(int n) {
        System.out.println(n);
        if (n==1){
            return;
        }
        printNumber(n-1);
    }
}
