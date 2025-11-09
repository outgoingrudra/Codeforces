
import java.util.Arrays;
import java.util.Scanner;

public class B_Your_Name {
      public static String sortCharacters(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        
        return new String(chars);
    }
    public static void main(String[] args) {
        int testcases;
        Scanner sc = new Scanner(System.in);
        testcases = sc.nextInt();

        while(testcases -- > 0){
            int n = sc.nextInt();
            String fi = sc.next();
            String se = sc.next();
            if(sortCharacters(se).equals(sortCharacters(fi))){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

            
        } 

    }
}