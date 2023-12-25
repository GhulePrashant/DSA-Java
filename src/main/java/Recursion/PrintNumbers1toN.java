package Recursion;

public class PrintNumbers1toN {
    public static void main(String[] args) {
        printNumbers(5);
    }

    private static void printNumbers(int i) {
        if (i==0){
            return;
        }

        printNumbers(i-1);

        System.out.println(i);
    }
}
