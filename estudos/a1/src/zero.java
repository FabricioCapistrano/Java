
import java.util.Scanner;


public class zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int[] B = new int[A];
        for (int i = 0; i < B.length; i++) {
            B[i] = in.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 0) {
                B[i-1] = 0;
            }
            
        } 
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[A-1]);
        }
        in.close();
    }
}
