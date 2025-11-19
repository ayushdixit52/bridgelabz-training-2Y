import java.util.*;

class OddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Math.abs(sc.nextLong());

        int sum = 0;

        while (n > 0) {
            int d = (int)(n % 10);
            if (d % 2 == 1) sum += d;
            n /= 10;
        }

        System.out.println(sum);
    }
}
