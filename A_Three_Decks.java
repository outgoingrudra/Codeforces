
import java.util.Scanner;

public  class A_Three_Decks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests -- > 0 ){

           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();

           int x = b - a ;
           if(x+b <= c){
             a = a+x;
             c = c-x;

             if((c-b)%3==0)
                System.out.println("YES");
             else
                System.out.println("NO");

           }
           else{
            System.out.println("NO");
           }


        }
    }
}