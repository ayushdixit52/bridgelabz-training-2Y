import java.util.*;

class NonRepeatedDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Math.abs(sc.nextLong());

        int[] freq = new int[10];

        if (n == 0) freq[0] = 1;

        while (n > 0) {
            int d = (int)(n % 10);
            freq[d]++;
            n /= 10;
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] == 1) count++;
        }

        System.out.println(count);
    }
}
