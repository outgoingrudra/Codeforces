//https://codeforces.com/problemset/problem/1741/A

import java.util.*;

public class A_Compare_T_Shirt_Sizes {

    static int countX(String s) {
        int c = 0;
        for (char ch : s.toCharArray())
            if (ch == 'X') c++;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            String a = sc.next();
            String b = sc.next();

            char lastA = a.charAt(a.length() - 1);
            char lastB = b.charAt(b.length() - 1);

            // Case 1: last letters differ (S, M, L)
            if (lastA != lastB) {
                if (lastA == 'S') System.out.println("<");
                else if (lastA == 'L') System.out.println(">");
                else {  // a = M
                    if (lastB == 'S') System.out.println(">");
                    else System.out.println("<"); // b = L
                }
                continue;
            }

            // Case 2: Same category (both S, both M, or both L)
            if (lastA == 'M') { 
                System.out.println("="); 
                continue;
            }

            // For S: more X means smaller
            // For L: more X means larger
            int xA = countX(a);
            int xB = countX(b);

            if (lastA == 'S') {
                if (xA == xB) System.out.println("=");
                else if (xA > xB) System.out.println("<");
                else System.out.println(">");
            } else { // lastA == 'L'
                if (xA == xB) System.out.println("=");
                else if (xA > xB) System.out.println(">");
                else System.out.println("<");
            }
        }
    }
}
