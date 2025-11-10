import java.util.*;

public class D_Yet_Another_Array_Problem {

    // GCD function (Euclidean algorithm)
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // Prime check for small x (optional)
    static boolean isPrime(long x) {
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;
        for (long i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long ans = -1;

            // Start from smallest x = 2
            for (long x = 2; x <= 100; x++) { // small range is enough
                boolean found = false;
                for (long val : a) {
                    if (gcd(val, x) == 1) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    ans = x;
                    break;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
