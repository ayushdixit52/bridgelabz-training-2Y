import java.util.Scanner;

public class q4 {

   
    public static void printNonRepeatingChars(String text) {
        int[] freq = new int[256]; 

        
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

       
        System.out.print("Non-repeating characters: ");
        boolean found = false;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                System.out.print(text.charAt(i) + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        printNonRepeatingChars(input);

        sc.close();
    }
}

