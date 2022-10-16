
import java.util.List;

public class BookReader implements IBookReader {
    @Override
    public void ScreenPrinter(Book book) {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }

    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        BookReader bookReader = new BookReader();
        bookReader.ScreenPrinter(book);
    }
}
