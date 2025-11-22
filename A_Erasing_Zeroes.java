import java.util.Scanner;

public class A_Erasing_Zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int first = -1, last = -1;

            // Find first and last '1'
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    if (first == -1) first = i;
                    last = i;
                }
            }

            // If no '1' or only one '1'
            if (first == -1 || first == last) {
                System.out.println(0);
                continue;
            }

            int ans = 0;

            // Count zeros between first and last 1
            for (int i = first; i <= last; i++) {
                if (s.charAt(i) == '0') ans++;
            }

            System.out.println(ans);
        }
    }
}
