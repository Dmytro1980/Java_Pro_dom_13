package phonebook;

public class Main {
    public static void main(String[] args) {

        Phonebook book = new Phonebook();

        book.add("Tom", "555-444-1123");
        book.add("Bill", "555-333-1234");
        book.add("John", "555-111-1100");
        book.add("Tom", "777-422-4444");
        book.add("Sam", "707-555-1314");
        book.add("John", "333-222-0010");

        // методы find() и finfAll() возвращают строку
        System.out.println("find() Tom John Alice");

        System.out.println(book.find("Tom"));
        System.out.println(book.find("John"));
        System.out.println(book.find("Alice"));

        System.out.println("\"findAll() Tom John Alice\"");

        System.out.println(book.findAll("Tom"));
        System.out.println(book.findAll("John"));
        System.out.println(book.findAll("Alice"));

        System.out.println();

        // методы findEntry() и findAllEntries() возвращают объект типа PhonebookEntry
        System.out.println("\"findEntry() John and Alice\"");
        System.out.println(book.findEntry("Tom").getName() + " " + book.findEntry("Tom").getPhone());
        System.out.println(book.findEntry("Alice").getName() + " " + book.findEntry("Alice").getPhone());

        System.out.println();

        System.out.println("\"findAllEntries() Tom John Alice\"");
        for (PhonebookEntry pbe : book.findAllEntries("Tom")) {
            System.out.println(pbe.getName() + " " + pbe.getPhone());
        }
        System.out.println();

        for (PhonebookEntry pbe : book.findAllEntries("John")) {
            System.out.println(pbe.getName() + " " + pbe.getPhone());
        }
        System.out.println();


        for (PhonebookEntry pbe : book.findAllEntries("Alice")) {
            System.out.println(pbe.getName() + " " + pbe.getPhone());
        }

    }
}
