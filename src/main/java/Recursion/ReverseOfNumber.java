package Recursion;

public class ReverseOfNumber {
    public static void main(String[] args) {
//        reverse(1248);
//        System.out.println(sum);
        reverse2(3097);
    }

    static int sum=0;
    static void reverse(int n){
        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum *10 + rem;

        reverse(n/10);
    }

    static void reverse2(int n){
        if (n<10){
            System.out.print(n);
            return;
        }else {
            System.out.print(n%10);
            reverse2(n/10);
        }
    }

}
