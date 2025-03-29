package exceptions;

public class InvalidStringException extends NullPointerException{
    public InvalidStringException(String message) {
        super(message);
    }
}
