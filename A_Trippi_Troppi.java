
import java.util.Scanner;

public class A_Trippi_Troppi{
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in) ;
            int tests = s.nextInt();
            s.nextLine();
            while(tests-- > 0 )
            {
                String str = s.nextLine().trim();
                String[] words = str.split(" ");
                String ans  = "";
                for (String st : words) {
                      ans += st.charAt(0);
                }
                System.out.println(ans);

            }
    }
}