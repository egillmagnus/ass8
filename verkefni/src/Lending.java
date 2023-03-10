import verkefni.src.Book;

import java.time.LocalDate;

public class Lending {
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    LocalDate dueDate;
    User user;
    Book book;

    public Lending(User user, Book book) {
        dueDate = LocalDate.now().plusDays(30);
        this.user = user;
        this.book = book;
    }

}
