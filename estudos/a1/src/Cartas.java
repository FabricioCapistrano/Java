
import java.util.Scanner;


public class Cartas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        
        if (A == B){
            System.out.println(C);
        }
        else {
            System.out.println(B);
        }
        teclado.close();
    }
}
