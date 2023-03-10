package verkefni.src;

public class UserOrBookDoesNotExistException extends Exception {
    private String message;

    public UserOrBookDoesNotExistException(String message) {
        this.message = message;
    }
}
