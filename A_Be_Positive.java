import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int testcases = sc.nextInt();
       
       while(testcases-- > 0) {
           int n = sc.nextInt();
           int countNeg = 0;
           int countZero = 0;
           
           for(int i = 0; i < n; i++) {
               int val = sc.nextInt();
               if(val < 0) {
                   countNeg++;
               } else if(val == 0) {
                   countZero++;
               }
           }
           
           int operations = countZero; // Convert all zeros to 1
           
           // If odd number of negatives, convert one -1 to 1
           if(countNeg % 2 == 1) {
               operations += 2;
           }
           
           System.out.println(operations);
       }
       sc.close();
    }
}