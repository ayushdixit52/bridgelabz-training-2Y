import java.util.Scanner;

public class q5 {
    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // Exception
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

       
        handleException(text);
    }
}
