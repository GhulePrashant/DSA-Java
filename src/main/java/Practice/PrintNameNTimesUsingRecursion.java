package Practice;

/**
 * TC : O(n)
 * SC : O(n)
 */
public class PrintNameNTimesUsingRecursion {
    public static void main(String[] args) {
        int n = 5;

        printName(n);
    }

    private static void printName(int i) {
        if (i==0){
            return;
        }
        System.out.println("Prashant");
        printName(i-1);
    }
}
