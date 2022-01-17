
import java.util.Scanner;

public class Fliper {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int P = teclado.nextInt();
        int R = teclado.nextInt();

        if (P == 0) {
            System.out.println("C");
        } else {
            if (R == 0) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
        teclado.close();
    }
}
