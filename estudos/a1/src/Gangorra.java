
import java.util.Scanner;


public class Gangorra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int P1 = teclado.nextInt();
        int C1 = teclado.nextInt();
        int P2 = teclado.nextInt();
        int C2 = teclado.nextInt();
        
        if(P1*C1 == P2*C2){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
        teclado.close();
    }
}
