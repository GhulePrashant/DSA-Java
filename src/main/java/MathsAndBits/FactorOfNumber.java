package MathsAndBits;

import java.util.ArrayList;

public class FactorOfNumber {
    public static void main(String[] args) {
        int n = 36;

        printAllFactors(n);
        System.out.println();
        factor(n);
    }

    // O(sqrt(n))
    private static void factor(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0){
                if (n/i == i){
                    System.out.print(i +" ");
                }else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    // O(n)
    private static void printAllFactors(int n) {
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0){
                System.out.print(i +" ");
            }
        }
    }
}
