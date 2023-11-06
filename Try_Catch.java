public class Try_Catch {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("Finished handling ArrayIndexOutOfBoundsException");
        }

        // ArithmeticException
        try {
            int division = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException");
        } finally {
            System.out.println("Finished handling ArithmeticException");
        }

        // NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException");
        } finally {
            System.out.println("Finished handling NullPointerException");
        }
    }
}

