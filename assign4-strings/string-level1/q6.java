import java.util.Scanner;

public class q6 {
    public static void generateException(String text, int start, int end) {
        System.out.println(text.substring(start, end));
    }

    public static void handleException(String text, int start, int end) {
        try {
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic Error: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        
        handleException(text, end, start);
    }
}

