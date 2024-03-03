package RecursionSubsetsSubsequenceStrings;

public class SubSequence {
    public static void main(String[] args) {
        subSequence("", "abc");
    }

    static void subSequence(String proc, String unProc){
        if (unProc.isEmpty()){
            System.out.println(proc);
            return;
        }

        char ch = unProc.charAt(0);

        subSequence(proc + ch , unProc.substring(1));
        subSequence(proc, unProc.substring(1));
    }
}
