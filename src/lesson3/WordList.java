package lesson3;

import java.util.*;

/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
 */


public class WordList {


    public static void main(String[] args) {
        String[] wordList = {
                "земля", "umbel", "абзац", "array", "вода",
                "огонь", "add", "абзац", "array", "вода",
                "мир", "array", "воздух", "воздух",
                "мир", "umbel", "wordList", "wordList"
        };
        String wordListString = Arrays.toString(wordList);
        System.out.println(wordListString);
        System.out.printf("Массив из %d элементов \n", wordList.length);

        System.out.println("========================= ");

        Map<String, Integer> wordTotCount = new LinkedHashMap<>();
        for (String w : wordList) {
            wordTotCount.merge(w, 1, Integer::sum);

        }
        System.out.println("Содержание слов следующее:");

        wordTotCount.forEach((word, frequency) -> {

            System.out.println(word + ": " + frequency);

        });
        //выводим по 1 элементу
        System.out.println("Список уникальных слов:");
        Set<String> set = new HashSet<>();
        for (String s : wordList)
            set.add(s);
        System.out.println(set);
        System.out.printf("Список из %d слов \n", set.size());
    }

}