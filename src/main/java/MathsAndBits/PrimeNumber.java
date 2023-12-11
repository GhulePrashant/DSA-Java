package MathsAndBits;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=59;

        System.out.println(checkPrimeNumber(n));

    }

    private static boolean checkPrimeNumber(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    private static boolean primeNumber(int n){
        for (int i=2 ; i<=Math.sqrt(n) ; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    private static boolean ifPrimeNumber(int n) {

        for (int i=2; i<= n/2 ; i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }
}
