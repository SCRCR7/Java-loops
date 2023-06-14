import java.util.ArrayList;

public class PhonebookDemo {
    public static void main(String[] args) {
        ArrayList<PhonebookEntry> phonebook = new ArrayList<>();

        phonebook.add(new PhonebookEntry("John Doe", "1234567890"));
        phonebook.add(new PhonebookEntry("Jane Smith", "9876543210"));
        phonebook.add(new PhonebookEntry("Bob Johnson", "5555555555"));
        phonebook.add(new PhonebookEntry("Alice Williams", "9999999999"));
        phonebook.add(new PhonebookEntry("David Brown", "1111111111"));

        for (PhonebookEntry entry : phonebook) {
            System.out.println("Name: " + entry.getName());
            System.out.println("Phone Number: " + entry.getPhoneNumber());
            System.out.println();
        }
    }
}

class PhonebookEntry {
    private String name;
    private String phoneNumber;

    public PhonebookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
