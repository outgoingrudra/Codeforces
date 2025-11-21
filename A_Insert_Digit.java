
import java.util.Scanner;

public class A_Insert_Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int nl = sc.nextInt();
            int d = sc.nextInt();
            String num = sc.next();
            String ans;
            ans = "";
            boolean done = false;
            for (int i = 0; i < num.length(); i++) {
                if (done) {
                    ans += num.charAt(i);
                } else {
                    int n = num.charAt(i) - '0';
                    if (n >= d) {
                        ans += num.charAt(i); 
                    }else {
                        ans += d ;
                        ans += num.charAt(i);
                        done = true ;

                    }
                }
            }
            if(!done)
            {
                ans += d ;
            }
            System.out.println(ans);

        }
    }
}
