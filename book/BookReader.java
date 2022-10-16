
import java.util.List;

public class BookReader implements IBookReader {
    @Override
    public void ScreenPrinter(Book book) {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }

    public static void main(String[] args) {
        BookReader bookReader = new BookReader();
        BookPublisher bookPublisher = new BookPublisher();
        bookReader.ScreenPrinter(bookPublisher.book);
    }
}
