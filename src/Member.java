import java.util.ArrayList;

public class Member {
    private int id;
    private String name;
    private Address address;
    private ArrayList<LibraryItem> borrowedItems;

    public Member(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.borrowedItems = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void borrowItem(LibraryItem item) {
        borrowedItems.add(item);
    }

    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

    public String getDetails() {
        return "Member ID: " + id + ", Name: " + name +
                ", Address: " + address.getFullAddress();
    }

    public void showBorrowedItems() {
        for (LibraryItem item : borrowedItems) {
            System.out.println(item.getDetails());
        }
    }
}