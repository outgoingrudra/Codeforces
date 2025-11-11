import java.util.Scanner;

public class A_Square_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();  
            int year = Integer.parseInt(s);  
            int root = (int) Math.sqrt(year);
            if (root * root == year) {
               
                System.out.println(0 + " " + root);
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}
