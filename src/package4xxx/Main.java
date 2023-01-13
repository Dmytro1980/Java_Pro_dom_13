package package4xxx;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String>list = package1.Main.fillList();
        List<Record> listRecord = findOccurrence(list);

        // печать возвращенного списка структур
        for (int i = 0; i < listRecord.size(); i++) {
            System.out.printf("{name: \"%s\", occurrence: %d}\n",
                    listRecord.get(i).getName(), listRecord.get(i).getOccurrence());
        }
    }

    private static List<Record> findOccurrence(List<String> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (!map.containsKey(list.get(i))) {
                map.put(list.get(i), 1);
            } else {
                map.put(list.get(i), map.get(list.get(i)) + 1);
            }
        }
        List<Record> listRecords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            listRecords.add(new Record(entry.getKey(), entry.getValue()));
        }
        return listRecords;
    }
}
