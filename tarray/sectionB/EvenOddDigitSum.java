import java.util.*;

class EvenOddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Math.abs(sc.nextLong());
        char ch = sc.next().charAt(0);

        int sum = 0;

        while (n > 0) {
            int d = (int)(n % 10);

            if ((ch == 'E' || ch == 'e') && d % 2 == 0) sum += d;
            if ((ch == 'O' || ch == 'o') && d % 2 == 1) sum += d;

            n /= 10;
        }

        System.out.println(sum);
    }
}

