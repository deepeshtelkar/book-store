import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book(1L, "Book One", "Author One", 19.99));
        books.add(new Book(2L, "Book Two", "Author Two", 24.99));
        books.add(new Book(3L, "Book Three", "Author Three", 14.99));
    }

    public static List<Book> getAllBooks() {
        return books;
    }

    public static Book getBookById(Long id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
