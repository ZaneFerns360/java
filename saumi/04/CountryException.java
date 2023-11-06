class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        String country = "USA";

        try {
            if (!country.equals("India")) {
                throw new NoMatchException("Country does not match 'India'");
            }

            System.out.println("Country is India.");
        } catch (NoMatchException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
