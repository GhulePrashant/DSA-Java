package MathsAndBits;

public class SqrtNewtonRaphson {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(sqrt(40));
    }

    static double sqrt(double n){
        double x = n;
        double root = 0.0;

        while(true){
            root = 0.5 * (x + (n/x)) ;

            if (Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
