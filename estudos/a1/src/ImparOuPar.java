
import java.util.Scanner;


public class ImparOuPar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Bino = teclado.nextInt();
        int Cino = teclado.nextInt();
        int dedos = (Bino + Cino) % 2;
        
        if (dedos ==0){
            System.out.println("Bino");     
        }
        else {
            System.out.println("Cino");     
        }
        teclado.close();
    }
}
