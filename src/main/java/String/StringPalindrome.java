package String;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "naman";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if (str==null || str.length()==0)
            return true;

        String str2 = str.toLowerCase();
        int length = str2.length();
        for (int i = 0; i <= length/2 ; i++) {
            if (str2.charAt(i) != str2.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
