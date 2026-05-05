public abstract class LibraryItem {
    private int id;
    private String title;
    private boolean isAvailable;

    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowItem() {
        isAvailable = false;
    }

    public void returnItem() {
        isAvailable = true;
    }

    public abstract String getDetails(); // polymorphism
}
