package verkefni.src;

import java.time.LocalDate;
import java.util.List;

public class LibrarySystem {

    private Book book;
    private LibrarySystem LibrarySystem;
    private FacultyMember facultyMember;
    private User user;

    public LibrarySystem() {
        LibrarySystem = new LibrarySystem();
    }

    public void addBookWithTitleAndAuthorlist(String title, List<Author> authors) throws EmptyAuthorListException {
        book = new Book(title, authors);
    }

    public void addStudentUser(String name, boolean feePaid) {
        if (feePaid == true) {
            user = new User(name);
        }
    }

    public void addFacultyMemberUser(String name, String department) {
        facultyMember = new FacultyMember(name, department);
    }

    public void findBookByTitle(String title) throws UserOrBookDoesNotExistException {
        if (book == null) {
            throw new UserOrBookDoesNotExistException("The book does not exist");
        }
        if (book.getTitle().equals(title)) {
            System.out.println("The book exists");
        } else {
            System.out.println("The book does not exist");
        }
    }

    public User findUserByName(String name) throws UserOrBookDoesNotExistException {
        if (user.getName().equals(name)) {
            return user;
        } else {
            throw new UserOrBookDoesNotExistException("The user does not exist");
        }
    }

    public void borrowBook(User user, Book book) {
        //use the lending class
    }

    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) throws UserOrBookDoesNotExistException {
        if (book == null) {
            throw new UserOrBookDoesNotExistException("The book does not exist");
        }
        if (facultyMember == null) {
            throw new UserOrBookDoesNotExistException("The faculty member does not exist");
        }
        //use the lending class
        if (book.getTitle().equals(facultyMember.getName())) {
            System.out.println("The book exists");

        }
    }

    public void returnBook(User user, Book book) throws UserOrBookDoesNotExistException {
        
    }

}
