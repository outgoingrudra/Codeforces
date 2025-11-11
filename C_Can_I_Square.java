import java.util.Scanner;

public class C_Can_I_Square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();

        while (tests-- > 0) {
            int n = s.nextInt();
            long ans = 0;  // Changed to long
            for (int i = 0; i < n; i++) {
                ans += s.nextInt();
            }
            
            long r = (long) Math.sqrt(ans);  // Changed to long
            if (r * r == ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        s.close();
    }
}