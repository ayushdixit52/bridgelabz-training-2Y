
import java.util.*;

class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for (int n = a; n <= b; n++) {
            if (n < 2) continue;

            boolean prime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) count++;
        }

        System.out.println(count);
    }
}
