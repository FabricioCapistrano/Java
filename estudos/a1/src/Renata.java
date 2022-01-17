
import java.util.Scanner;


public class Renata {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int m = teclado.nextInt();
        int x = a+m;
        boolean viagem = x <= 50;
        System.out.println(viagem);
        teclado.close();
    }
}
