package exceptions;

public class InvalidUserInputException extends Throwable{
    public InvalidUserInputException(String message) {
        super(message);
    }
}
