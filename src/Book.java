public class Book {
    private String authorName;
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return bookName;
    }
}
