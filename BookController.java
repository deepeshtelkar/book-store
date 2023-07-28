import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getAllBooks(Model model) {
        model.addAttribute("books", BookRepository.getAllBooks());
        return "book-list";
    }

    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable Long id, Model model) {
        Book book = BookRepository.getBookById(id);
        model.addAttribute("book", book);
        return "book-details";
    }
}
