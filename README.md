# Pattern Matcher

## Задача 290

Дан шаблон и строка `s`. Необходимо определить, следует ли строка `s` этому шаблону.
"Следует" означает полное соответствие, такое что существует биекция между буквой в шаблоне и непустым словом в строке `s`.

### Пример
```plaintext
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
```

---

## Реализация

Код написан на языке Java.

### Код
```java
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
```

---

## Как запустить

1. Убедитесь, что у вас установлен [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Скопируйте код в файл `PatternMatcher.java`.
3. Скомпилируйте и запустите программу:
   ```bash
   javac PatternMatcher.java
   java PatternMatcher
   ```

Вывод программы:
```plaintext
Output: true
```

---

## Структура проекта
```
pattern-matcher/
├── src/
│   └── PatternMatcher.java   # Основной код программы
├── README.md                 # Описание проекта
└── .gitignore                # Файлы и папки для исключения из репозитория
```

---

## Лицензия
Этот проект распространяется под лицензией MIT. Подробнее см. в файле [LICENSE](./LICENSE).
