
import java.util.Scanner;


public class PisoDaEscola {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int L = teclado.nextInt();
        int C = teclado.nextInt();
        
        int Tipo1 = L*C +((L-1)*(C-1));
        int Tipo2 = ((L-1)+(C-1))*2;
        
        System.out.println(Tipo1);
        System.out.println(Tipo2);
        teclado.close();
    }
}
