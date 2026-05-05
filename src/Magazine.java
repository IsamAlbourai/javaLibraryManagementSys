public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        if (issueNumber <= 0) {
            throw new IllegalArgumentException("Issue number must be positive.");
        }
        this.issueNumber = issueNumber;
    }

    @Override
    public String getDetails() {
        return "Magazine ID: " + getId() + ", Title: " + getTitle() +
                ", Issue: " + issueNumber + ", Available: " + isAvailable();
    }
}