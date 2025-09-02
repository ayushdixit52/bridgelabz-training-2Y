import java.util.Scanner;

public class q7 {
    public static void generateException(String text) {
        int num = Integer.parseInt(text); // Exception
        System.out.println(num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        // generateException(input);
        handleException(input);
    }
}

