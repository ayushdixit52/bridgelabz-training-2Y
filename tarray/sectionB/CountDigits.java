import java.util.*;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Math.abs(sc.nextLong());

        int count = 0;

        if (n == 0) count = 1;
        else {
            while (n > 0) {
                count++;
                n /= 10;
            }
        }

        System.out.println(count);
    }
}

