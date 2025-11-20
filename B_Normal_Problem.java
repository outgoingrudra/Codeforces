import java.util.Scanner;

public class B_Normal_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String a = sc.next();
            a = new StringBuilder(a).reverse().toString();

            StringBuilder b = new StringBuilder();

            for (int i = 0; i < a.length(); i++) {
                char x = a.charAt(i);
                if (x == 'w') b.append('w');
                else if (x == 'p') b.append('q');
                else b.append('p');
            }

            System.out.println(b.toString());
        }
    }
}
