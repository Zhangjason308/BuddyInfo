import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addresses;

    public AddressBook() {
        this.addresses = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo address) {
        addresses.add(address);
    }

    public void removeBuddy(BuddyInfo address) {
        addresses.remove(address);
    }
    public static void main(String[] args) {
    System.out.println("Address Book");
    }
}
