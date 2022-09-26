public class BuddyInfo {
    public String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
    }
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo Homer = new BuddyInfo("Homer", "Carleton", "613");
        System.out.println("Hello World!");
        System.out.println(Homer.getName());

    }
}
