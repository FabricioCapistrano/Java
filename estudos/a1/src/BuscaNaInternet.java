
import java.util.Scanner;


public class BuscaNaInternet {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int t = teclado.nextInt();
        System.out.println(t*4);
        teclado.close();
    }
}
