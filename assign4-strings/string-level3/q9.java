import java.util.Scanner;

public class q9 {

    static String[] months = {"", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};

    static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int dayOfWeek(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31*m0)/12) % 7;
    }

    
    public static void printCalendar(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            days[2] = 29;
        } else {
            days[2] = 28;
        }

        System.out.println("   " + months[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int d = dayOfWeek(1, month, year);

        
        for (int i = 0; i < d; i++) {
            System.out.print("    ");
        }

        
        for (int i = 1; i <= days[month]; i++) {
            System.out.printf("%4d", i);
            if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);

        sc.close();
    }
}

