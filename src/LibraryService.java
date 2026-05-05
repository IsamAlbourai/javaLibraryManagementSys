import java.util.ArrayList;

public class LibraryService {
    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public LibraryItem findItemById(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id)
                return item;
        }
        return null;
    }

    public void listAvailableItems() {
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                System.out.println(item.getDetails());
            }
        }
    }

    public void searchByTitle(String keyword) {
        for (LibraryItem item : items) {
            if (item.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(item.getDetails());
            }
        }
    }
}