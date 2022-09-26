import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo aBuddy) {
        if(aBuddy != null) {
            myBuddies.add(aBuddy);
        }
    }
    public BuddyInfo removeBuddy(int index) {
        if (index >=0 && index < myBuddies.size()) {
           return myBuddies.remove(index);
        }
        return null;
    }

    public void randomFunction(int index) {
        System.out.println("Part 3 question 4");
    }

    public static void main(String[] args) {
    System.out.println("Address Book");
    BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
    AddressBook addressBook = new AddressBook();
    addressBook.addBuddy(buddy);
    addressBook.removeBuddy(0); //value changed from 0 to 1
        //This is for Github question 11 -> need to push in order ot show changes in github, elsewise it commits only affect local repo
        //This is for question 17, editing the github file
        //Question 4 of Part 3, edit the file on branch

    }
}

