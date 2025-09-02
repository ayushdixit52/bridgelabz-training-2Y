import java.util.Scanner;

public class q3 {

    
    public static char firstNonRepeatingChar(String text) {
        int[] freq = new int[256]; // ASCII characters

        
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

       
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = firstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}

