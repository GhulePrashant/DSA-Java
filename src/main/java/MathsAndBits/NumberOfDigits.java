package MathsAndBits;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 10375;
        int base = 10;

        int ans = (int)(Math.log(n) / Math.log(base)) + 1;

        System.out.println(ans);
        System.out.println((int)Math.log10(n) + 1);
    }
}
