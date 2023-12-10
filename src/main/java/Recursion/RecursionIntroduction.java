package Recursion;

public class RecursionIntroduction {
    public static void main(String[] args) {
        int n = 5;
        print(1);
    }

    private static void print(int n) {
        // base condition which will stop our recursive calls when a specific condition is met
        if (n==10){
            System.out.println(n);
            return;
        }
        // body
        System.out.println(n);

        // recursive call to same function
        // tail recursion
        print(n+1);
    }
}
