
import java.util.Arrays;
import java.util.Scanner;

public class dificil {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int D[] = new int[N];
        int E[] = new int[N];
        for (int i = 0; i < D.length; i++) {
            D[i] = in.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            E[i] = D[i] - D[i++];
        }
        Arrays.sort(E);
        System.out.println(E[0]);
        in.close();
    }
}
