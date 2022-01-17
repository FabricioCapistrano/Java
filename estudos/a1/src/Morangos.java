
import java.util.Scanner;


public class Morangos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int C1 = teclado.nextInt();
        int L1 = teclado.nextInt();
        int C2 = teclado.nextInt();
        int L2 = teclado.nextInt();
        
        int area1 = C1 * L1 ;
        int area2 = C2 * L2 ;
        
        if (area1 < area2){
            System.out.println(area2);
        }   
        else {
            System.out.println(area1);
        }
        teclado.close();
    }
}
