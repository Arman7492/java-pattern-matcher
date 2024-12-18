import java.util.HashMap;

public class PatternMatcher {

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> patternToWord = new HashMap<>();
        HashMap<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentPatternChar = pattern.charAt(i);
            String currentWord = words[i];


            if (patternToWord.containsKey(currentPatternChar)) {
                if (!patternToWord.get(currentPatternChar).equals(currentWord)) {
                    return false;
                }
            } else {
                patternToWord.put(currentPatternChar, currentWord);
            }


            if (wordToPattern.containsKey(currentWord)) {
                if (!wordToPattern.get(currentWord).equals(currentPatternChar)) {
                    return false;
                }
            } else {
                wordToPattern.put(currentWord, currentPatternChar);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        boolean result = wordPattern(pattern, s);
        System.out.println("Output: " + result);
    }
}
