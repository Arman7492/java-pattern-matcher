import java.util.HashMap;

public class PatternMatcher {

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" "); // Разбиваем строку на слова
        if (pattern.length() != words.length) {
            return false; // Если количество символов в шаблоне не совпадает с количеством слов
        }

        HashMap<Character, String> patternToWord = new HashMap<>();
        HashMap<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentPatternChar = pattern.charAt(i);
            String currentWord = words[i];

            // Проверяем, соответствует ли символ шаблона текущему слову
            if (patternToWord.containsKey(currentPatternChar)) {
                if (!patternToWord.get(currentPatternChar).equals(currentWord)) {
                    return false; // Нарушение соответствия
                }
            } else {
                patternToWord.put(currentPatternChar, currentWord);
            }

            // Проверяем, соответствует ли слово текущему символу шаблона
            if (wordToPattern.containsKey(currentWord)) {
                if (!wordToPattern.get(currentWord).equals(currentPatternChar)) {
                    return false; // Нарушение соответствия
                }
            } else {
                wordToPattern.put(currentWord, currentPatternChar);
            }
        }

        return true; // Шаблон и строка соответствуют друг другу
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        boolean result = wordPattern(pattern, s);
        System.out.println("Output: " + result); // Ожидается: true
    }
}
