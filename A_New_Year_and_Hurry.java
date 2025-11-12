
import java.util.Scanner;

public class A_New_Year_and_Hurry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int time = 240 - k ;
        int i = 1;
        while(true){
            if(time<5*i || n<i){
                break;
            }
            time -= 5*i;
            i++;

        }
        System.out.println(i-1);

    }
}