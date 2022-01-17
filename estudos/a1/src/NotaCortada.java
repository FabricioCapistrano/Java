
import java.util.Scanner;

public class NotaCortada {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int B = teclado.nextInt();
    int T = teclado.nextInt();
    int X = ((B*70)+(70*T))/2;
    
        if (5600>X) {
            System.out.println("2");
        }
        else if (5600==X) {
            System.out.println("0");
        }
        else if(5600<X){
            System.out.println("1");
        }
        teclado.close();
}
}
