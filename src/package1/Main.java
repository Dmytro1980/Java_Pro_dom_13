package package1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = fillList();
        countOccurrence(list, "Tom");
        countOccurrence(list, "Bob");
        countOccurrence(list, "John");
    }

    public static List<String> fillList() {
        List<String> listRand = new ArrayList<>();
        String[] words = new String[]{"Tom", "Bob", "Oliver",
                "James", "Jack", "Connor", "John", "Harry",
                "Robert", "Jacob", "Michael", "Mary", "Samantha",
                "Patricia", "Jennifer", "Isabella", "Linda", "Victoria", "Lily"};

//        // временный вывод массива words для проверки
//        for (String s : words) System.out.print(s + " ");
//        System.out.println();

        // копирование элемента массива в список от 1 до 3-х раз (для заполнения случайным количеством слов)
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < ((int) (Math.random() * 3) + 1); j++) {
                listRand.add(words[i]);
            }
        }

        // mix listRand
        Collections.shuffle(listRand);

//        // временный вывод listRand для проверки
//        for (String s: listRand) System.out.print(s + " ");
//        System.out.println();

        return listRand;
    }

    static void countOccurrence(List<String> list, String string) {
        int wordCounter = 0;
        for (String s : list) {
            if (s.equals(string)) wordCounter++;
        }
        System.out.printf("The word %s occurs %d times\n", string, wordCounter);
    }


}

