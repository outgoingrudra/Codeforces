import java.util.Scanner;
class A_Candies_for_Nephews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            
         
            int remainder = n % 3;
           
            int candiesNeeded = (3 - remainder) % 3;
            
            System.out.println(candiesNeeded);
        }
        
        sc.close();
    }
}