
import java.util.Scanner;


public class Drone {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int H = teclado.nextInt();
        int L = teclado.nextInt();
        int AB = A * B;
        int BC = B * C;
        int AC = A * C;
        int HL = H * L;
        
        if(AB <= HL){
            System.out.println("S");
        }
        else if(BC <= HL){
            System.out.println("S");
        }
        else if(AC <= HL){
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }
        teclado.close();
    }
}
