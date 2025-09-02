import java.util.Scanner;

public class q8 {
    public static int[] getAges(int count) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) result[i][1] = "Can Vote";
            else if (ages[i] < 0) result[i][1] = "Invalid Age";
            else result[i][1] = "Cannot Vote";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ages = getAges(10);
        String[][] status = checkVoting(ages);

        System.out.println("Age\tStatus");
        for (int i = 0; i < status.length; i++) {
            System.out.println(status[i][0] + "\t" + status[i][1]);
        }
    }
}

