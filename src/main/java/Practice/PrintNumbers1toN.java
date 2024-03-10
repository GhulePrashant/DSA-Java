package Practice;

public class PrintNumbers1toN {
    public static void main(String[] args) {
        int n = 10;

        printNumbers(n);
    }

    private static void printNumbers(int n) {
        if (n<1){
            return;
        }
        printNumbers(n-1);
//        System.out.println(n);
        printNumbersNto1(15,1);
    }

    private static void printNumbersNto1(int n, int i){
        if (n<i){
            return;
        }
        printNumbersNto1(n, i+1);
        System.out.println(i);
    }
}
