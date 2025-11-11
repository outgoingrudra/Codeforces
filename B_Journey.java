
import java.util.Scanner;

class B_Journey{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-- > 0 )
        {

               int n = sc.nextInt();
               int a = sc.nextInt();
               int b = sc.nextInt();
               int c = sc.nextInt();

               int loop = n/(a+b+c);
               int days = loop*3;
                n = n%(a+b+c);
                if(n>0){
                    days++;
                    n-=a;
                }
                if(n>0){
                    n-=b;
                    days++;
                }
                if(n>0){
                    days++;
                }
                System.out.println(days);

                   




        }
    }
}