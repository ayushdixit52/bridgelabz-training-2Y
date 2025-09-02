public class q4 {
    public static void generateException() {
        String text = null;
        System.out.println(text.toUpperCase()); // Throws NullPointerException
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Handled Exception: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to see exception
        handleException();      // Correct way with handling
    }
}

