package LinearSearch;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Prashant";
        char target = scanner.next().charAt(0);

        System.out.println("Character "+target+ " found : "+ search2(name, target));
    }

    static boolean search(String str, char target){
        if (str.isEmpty())
            return false;

        for (int i=0; i<str.length(); i++){
            if (target == str.charAt(i))
                return true;
        }
        return false;
    }

    static boolean search2(String str, char target){
        if (str.isEmpty())
            return false;

        return IntStream.range(0, str.length()).anyMatch(i -> target == str.charAt(i));
    }

    static boolean search3(String str, char target){
        if (str.isEmpty())
            return false;

        for (char ch : str.toCharArray()){
            if (target == ch)
                return true;
        }
        return false;
    }
}
