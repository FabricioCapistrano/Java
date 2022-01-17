
import java.util.Scanner;


public class IdadeDeDonaMonica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int M = teclado.nextInt();
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        System.out.println(M-(A+B));
        teclado.close();
    }
}
