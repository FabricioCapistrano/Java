
import java.util.Scanner;


public class Pneu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        
        System.out.println(N-M);
        in.close();
    }
}
