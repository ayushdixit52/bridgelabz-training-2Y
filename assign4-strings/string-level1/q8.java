import java.util.Scanner;

public class q8 {
    public static void generateException(String[] arr, int index) {
        System.out.println(arr[index]); // Exception
    }

    public static void handleException(String[] arr, int index) {
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"A", "B", "C"};
        int index = sc.nextInt();

       
        handleException(names, index);
    }
}
