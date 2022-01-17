
import java.util.Scanner;


public class NotaEsquecida {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int M = in.nextInt();
        int S = (M*2) - A;
        System.out.println(S);
        in.close();
    }
}
