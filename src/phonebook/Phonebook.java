package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    List<PhonebookEntry> entryList;

    public Phonebook() {
        this.entryList = new ArrayList<>();
    }

    public void add(String name, String phone) {
        entryList.add(new PhonebookEntry(name, phone));
    }

    public String find(String name) {
        for (PhonebookEntry entry : this.entryList) {
            if (entry.getName().equals(name)) {
                return entry.getName() + " " + entry.getPhone();
            }
        }
        return null;
    }

    public String findAll(String name) {
        String s = "";
        for (PhonebookEntry entry : this.entryList) {
            if (entry.getName().equals(name)) {
                s = s + entry.getName() + " " + entry.getPhone() + "\n";
            }
        }
        if (s == "") {
            return null;
        } else return s;
    }

    public PhonebookEntry findEntry(String name) {
        for (PhonebookEntry entry : this.entryList) {
            if (entry.getName().equals(name)) {
                return entry;
            }
        }
        PhonebookEntry entry = new PhonebookEntry(null, null);
        return entry;
    }

    public List<PhonebookEntry> findAllEntries(String name) {
        String s = "";
        List<PhonebookEntry> list = new ArrayList<>();
        for (PhonebookEntry entry : this.entryList) {
            if (entry.getName().equals(name)) {
                list.add(new PhonebookEntry(entry.getName(),entry.getPhone()));
            }
        }
        if (list.isEmpty()){
            list.add(new PhonebookEntry(null,null));
            return list;
        } else {
            return list;
        }

    }
}

