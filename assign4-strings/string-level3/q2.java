import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int length = getLength(text);
        char[] uniqueChars = findUniqueCharacters(text, length);

        System.out.println("Unique characters:");
        for (char c : uniqueChars) {
            if (c != 0)
                System.out.print(c + " ");
        }
    }

    
    static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }


    static char[] findUniqueCharacters(String str, int len) {
        char[] unique = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[index++] = current;
            }
        }

        return unique;
    }
}

