package MathsAndBits;

public class ReverseNumber {
    public static void main(String[] args) {

        int n = 1534236469;

        System.out.println(reverse(n));

    }

    public static int reverse(int n){
        int reverse = 0;
        int rem = 0;
        int prev_rev = 0;
        while(n!=0){
            rem = n % 10;
            reverse = (reverse * 10) + rem;
            if ((reverse - rem)/10 != prev_rev) {
                return 0;
            }
            prev_rev = reverse;
            n = n/10;
        }
        return reverse;
    }

}
