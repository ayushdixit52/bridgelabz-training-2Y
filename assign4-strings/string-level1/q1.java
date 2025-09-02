import java.util.Scanner;

public class q1 {
    public static boolean compareUsingCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        boolean customCompare = compareUsingCharAt(str1, str2);
        boolean builtInCompare = str1.equals(str2);

        System.out.println("Custom Compare: " + customCompare);
        System.out.println("Built-in Compare: " + builtInCompare);
    }
}
