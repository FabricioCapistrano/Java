
import java.util.Scanner;

public class Teleferico {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int A = in.nextInt();
        
        int a = A/(N-1);
        int b = A%(N-1);
        int c = a;
        
        if (b>0) {
            c=c+1;
        }
        System.out.println(c);
        in.close();
    }
}
