import java.util.Date;

public class Book {
    private final String title;
    private final String author;
    private final String published;

    public Book(String title, String author, String published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }

    public String getPublished() {
        return published;
    }

}