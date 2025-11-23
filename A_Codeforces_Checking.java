import java.util.Scanner;

public class A_Codeforces_Checking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-- > 0)
        {
            char c = sc.next().charAt(0);
            boolean found = false;

            for(char x : "codeforces".toCharArray())
            {
                if(x == c){
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}
