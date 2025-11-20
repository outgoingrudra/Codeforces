
import java.util.Scanner;

public class A_Creating_Words{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt() ;
        while(tests -- > 0)
        {
            String a = sc.next() ;
            String b = sc.next() ;
            char x = a.charAt(0);
            a = b.charAt(0) + a.substring(1);
            b = x + b.substring(1);
            System.out.println(a+" "+b);
        }
    }
}