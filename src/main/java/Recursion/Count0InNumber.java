package Recursion;

public class Count0InNumber {
    public static void main(String[] args) {
        System.out.println(countZero(10003, 0));
    }

    static int countZero(int n, int count){
        if (n==0){
            return count;
        }
        int rem = n%10;
        if (rem == 0){
            return countZero(n/10, count+1);
        }
        return countZero(n/10, count);
    }

}
