import java.util.Scanner;

public class B_Different_String {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tests = s.nextInt();
        
        while (tests-- > 0) {
            String str = s.next();
            boolean pos = false;
            int i;

            for (i = 1; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(0)) {
                    pos = true;
                    break;   // <-- prevents i from going out of range
                }
            }

            if (!pos) {
                System.out.println("NO");
            } else {
                char[] arr = str.toCharArray();
                char temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                System.out.println("YES");
                System.out.println(new String(arr));
            }
        }
    }
}
