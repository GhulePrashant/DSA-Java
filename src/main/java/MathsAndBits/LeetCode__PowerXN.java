package MathsAndBits;

public class LeetCode__PowerXN {
    public static void main(String[] args) {
        double x = 2;
        int n = -2;

        System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n) {
        double ans = 1;
        long nn = n;
        if (nn < 0){
            nn = nn * -1;
        }

        while(nn > 0){
            if (nn % 2 == 1){
                ans = ans * x;
                nn = nn -1;
            }else {
                x = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0){
            ans = 1 / ans ;
        }

        return ans;
    }
}
