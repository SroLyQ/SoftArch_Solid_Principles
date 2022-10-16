
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BookPublisher implements IBookPublisher {

    public Book book;

    public BookPublisher() {
        this.book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
    }

    @Override
    public void FilePrinter(Book book) {
        boolean isEven = false;
        String previousPage = "";
        try {
            FileWriter fileWriter = new FileWriter(book.getTitle() + ".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            do {
                if (isEven) {
                    previousPage = book.getCurrentPage();
                    isEven = false;
                } else {
                    printWriter.printf("%-25s : %25s%n", previousPage, book.getCurrentPage());
                    isEven = true;
                }
            } while (book.turnToNextPage());
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Cannot print this book due to IOException");
        }
    }

    public static void main(String[] args) {
        BookPublisher bookPublisher = new BookPublisher();
        bookPublisher.FilePrinter(bookPublisher.book);
    }
}
