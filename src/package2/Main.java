package package2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] array = fillIntArray();
        List<Integer>listInt = toList(array);
        // вывод элементов списка
        for (int i : listInt) System.out.print(i + " ");
        System.out.println();
    }

    static int[] fillIntArray() {
        int arrLength = (int) (Math.random() * 90) + 10;      // размер массива от 10 до 100
        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            array[i] = (int) (Math.random() * 90) + 10;      // заполнение массива элементами от 10 до 100
        }

//        // временный вывод количества элементов массива для проверки
//        System.out.println(arrLength);

        return array;
    }

    static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) list.add(i);
        return list;
    }
}
