package package3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Integer> listInt = fillIntList();

//        // очистка списка listInt - для проверки
//        listInt.clear();
//        // заполнение списка listInt - для проверки, меньше значений для вывода
//        Collections.addAll(listInt, 8, 3, 1, 2, 3, 7, 1, 4, 5, 2, 6, 3);

        // печать списка listInt
        System.out.println("list: ");
        for (int i : listInt) System.out.print(i + " ");
        System.out.println();

        findUnique(listInt);        // через HashSet
        findUniqueFor(listInt);     // через перебор
    }

    static List<Integer> fillIntList() {
        int listLength = (int) (Math.random() * 90) + 10;      // будущий размер списка от 10 до 100
        List<Integer> list = new ArrayList<>(listLength);
        for (int i = 0; i < listLength; i++) {
            list.add((int) (Math.random() * 90) + 10);      // заполнение массива элементами от 10 до 100
        }
        return list;
    }

    static List<Integer> findUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

        // вывод list
        System.out.println();
        System.out.println("unique list (use HashSet):");
        for (int i : list) System.out.print(i + " ");
        System.out.println();

        return list;
    }

    static List<Integer> findUniqueFor(List<Integer> list) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            boolean isUnique = false;
            for (int j = 0; j < i; j++) {
                if (list.get(i) == list.get(j)) {
                    isUnique = true;
                    break;
                }
            }
            if (!isUnique) {
                resultList.add(list.get(i));
            }
        }

        // вывод list
        System.out.println();
        System.out.println("unique resList (use for):");
        for (int i : resultList) System.out.print(i + " ");
        System.out.println();

        return resultList;
    }
}
