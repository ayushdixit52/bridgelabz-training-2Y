import java.util.*;

class NthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0, num = 2;

        while (true) {
            boolean prime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) count++;

            if (count == n) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
