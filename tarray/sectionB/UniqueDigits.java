import java.util.*;

class UniqueDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Math.abs(sc.nextLong());

        boolean[] seen = new boolean[10];

        if (n == 0) seen[0] = true;

        while (n > 0) {
            int d = (int)(n % 10);
            seen[d] = true;
            n /= 10;
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (seen[i]) count++;
        }

        System.out.println(count);
    }
}

