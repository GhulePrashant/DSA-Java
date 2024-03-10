package Recursion;

public class PalindromeString {

    public static void main(String[] args) {
        String str = "namaan";

//        System.out.println(palindromeString(str, 0));
        System.out.println(checkPalindrome("."));
    }

    private static boolean palindromeString(String str, int index) {

        if (index >= str.length()/2){
            return true;
        }

        if (str.charAt(index) != str.charAt(str.length()-1-index)){
            return false;
        }

        return palindromeString(str, index+1);
    }

        public boolean isPalindrome(String s) {
            if (s.isEmpty()) {
                return true;
            }

            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                char leftChar = s.charAt(left);
                char rightChar = s.charAt(right);

                if (!Character.isLetterOrDigit(leftChar)) {
                    left++;
                } else if (!Character.isLetterOrDigit(rightChar)) {
                    right--;
                } else {
                    if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                        return false;
                    }
                    left++;
                    right--;
                }
            }

            return true;
        }

        public static boolean checkPalindrome(String s){

            StringBuilder sb = new StringBuilder();
            for(char ch : s.toCharArray()){
                if(Character.isLetterOrDigit(ch)){
                    sb.append(ch);
                }

            }

            String str = String.valueOf(sb).toLowerCase();
            int start=0;
            int length = str.length();
            if (length==0){
                return true;
            }else {
                while (start <= length / 2) {
                    if (str.charAt(start) != str.charAt(length - 1 - start)) {
                        return false;
                    }
                    start++;
                }
                return true;
            }
        }

}
