package exceptions;

public class CustomException {
    public static void main(String[] args) {
        try {
            validateUserName(null);
        } catch (InvalidUserInputException e) {
            System.out.println(e.getMessage());
        }
        try {
            validateOrder(-1);
        } catch (InvalidOrderException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("checked and unchecked exceptions");

        try {
            NullCheck(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateUserName(String userName) throws InvalidUserInputException {
        if (userName == null || userName.isEmpty()) {
            throw new InvalidUserInputException("Username cannot be null or empty");
        }
    }

    public static void validateOrder(int orderId) throws InvalidOrderException {
        if (orderId <= 0) {
            throw new InvalidOrderException("Invalid order ID: " + orderId);
        }
    }

    public static void NullCheck(String str) throws InvalidStringException{
        System.out.println(str.substring(3));
        if (str == null) {
            throw new InvalidStringException("String cannot be null");
        }
    }
}
