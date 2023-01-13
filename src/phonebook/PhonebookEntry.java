package phonebook;

public class PhonebookEntry {
    private String name;
    private String phone;

    public PhonebookEntry(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
