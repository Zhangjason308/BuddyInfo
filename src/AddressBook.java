import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> addresses;

    public AddressBook() {
        addresses = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo address) {
        addresses.add(address);
    }

    public void removeBuddy(BuddyInfo address) {
        addresses.remove(address);
    }
    public static void main(String[] args) {
    System.out.println("Address Book");
    BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
    AddressBook addressBook = new AddressBook();
    addressBook.addBuddy(buddy);
    addressBook.removeBuddy(buddy);

    }
}

