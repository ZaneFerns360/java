// Define the custom exception
class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class exception{
    public static void main(String[] args) {
        try {
            checkString("USA");
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkString(String str) throws NoMatchException {
        if (!str.equals("India")) {
            throw new NoMatchException("String is not equal to 'India'");
        }
    }
}
