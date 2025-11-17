
import java.util.Scanner;

public class A_Homework{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();
        while(tests-- > 0)
        {
            int al = s.nextInt();
            String a = s.next();
            int m = s.nextInt();
            String b = s.next();
            String c = s.next();
            for (int i = 0; i < m; i++) {
                 if(c.charAt(i)=='V')
                 {
                    a = b.charAt(i) + a ;
                 }
                 else{
                    a =  a+ b.charAt(i)  ;
                 }
                
          
         }
           System.out.println(a); 
        }
    }
}