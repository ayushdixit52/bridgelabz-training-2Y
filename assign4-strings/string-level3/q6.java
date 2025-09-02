import java.util.Scanner;

public class q6 {

    
    public static void printUnique(String text) {
        boolean[] visited = new boolean[256];

        System.out.print("Unique characters: ");
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!visited[c]) {
                visited[c] = true;
                System.out.print(c + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        printUnique(input);

        sc.close();
    }
}
