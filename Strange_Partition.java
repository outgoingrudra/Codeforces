import java.util.*;

public class Strange_Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();

            long sum = 0;
            long maxGroups = 0;

            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                sum += a;
                maxGroups += (a + x - 1) / x; // ceil(a / x)
            }

            long minGroups = (sum + x - 1) / x; // ceil(sum / x)

            System.out.println(minGroups + " " + maxGroups);
        }
        sc.close();
    }
}
