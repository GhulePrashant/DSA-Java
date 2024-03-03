package RecursionSubsetsSubsequenceStrings;

public class RemoveAllOccurrencesOfSpecificCharacter {
    public static void main(String[] args) {
        String str = "baccd";
        System.out.println(removeOccurrencesFromString(str));
        System.out.println(removeSubstring(str, "cc"));
    }

    static String removeOccurrencesFromString(String unProcessed){
        if (unProcessed.isEmpty()){
            return "";
        }
        char ch = unProcessed.charAt(0);

        if (ch == 'a'){
            return removeOccurrencesFromString(unProcessed.substring(1));
        }else {
            return ch + removeOccurrencesFromString(unProcessed.substring(1));
        }
    }

    static String removeSubstring(String str, String target){
        if (str.isEmpty()){
            return "";
        }

        if (str.startsWith(target)){
            return removeSubstring(str.substring(target.length()), target);
        }else {
            return str.charAt(0) + removeSubstring(str.substring(1), target);
        }
    }

    static void removeOccurrences(String processed, String unProcessed){
        if (unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);

        if (ch == 'a'){
            removeOccurrences(processed, unProcessed.substring(1));
        }else {
            removeOccurrences(processed+ch, unProcessed.substring(1));
        }
    }
}
