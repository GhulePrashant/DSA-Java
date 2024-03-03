package RecursionSubsetsSubsequenceStrings;

public class PermutationsOfString {
    public static void main(String[] args) {
        permutations("","abc");
    }

    static void permutations(String proc, String unProc){
        if (unProc.isEmpty()){
            System.out.println(proc);
            return;
        }

        char ch = unProc.charAt(0);
        for (int i = 0; i <= proc.length(); i++){
            String first = proc.substring(0,i);
            String sec = proc.substring(i, proc.length());
            permutations(first+ch+sec, unProc.substring(1));
        }
    }
}
