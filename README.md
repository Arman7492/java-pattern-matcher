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
