gpublic class Book extends LibraryItem {
    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "Book ID: " + getId() + ", Title: " + getTitle() +
                ", Author: " + author +
                ", Available: " + isAvailable();
    }
}