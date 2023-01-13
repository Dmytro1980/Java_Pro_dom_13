package package4xx;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String>list = package1.Main.fillList();
        calcOccurrence(list);

    }

    static void calcOccurrence(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (!map.containsKey(list.get(i))) {
                map.put(list.get(i), 1);
            } else {
                map.put(list.get(i), map.get(list.get(i)) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }


    }
}
