
import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int N = in.nextInt();
        int X[] = new int[N];
        int S = 0;
        int C = 0;
        for (int i = 0; i < X.length; i++) {
            X[i]= in.nextInt();
            
        }
        
        for (int i = 0; i < X.length; i++) {
            if (X[i]<50) {
                S=S+1;
               
            }
            else if (X[i]>= 50 && X[i]<85) {
                C=C+1;
                
            }
            else if (X[i]>=85) {
                
            }
            
        }
        System.out.print(S);
        System.out.print(C);
        in.close();
    }
}
