
import java.util.Scanner;


public class Xadrez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int L = teclado.nextInt();
        int C = teclado.nextInt();
        if ((L+C)% 2 == 0) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
        teclado.close();
    }
}
