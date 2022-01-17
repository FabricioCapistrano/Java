
import java.util.Scanner;


public class Lampadas {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int A = 0; int B = 0; int I1 = 1; int I2 = 2;
        int N = teclado.nextInt();
        int i = 0;
        int E = 0;
        while (i < N) {
             E = teclado.nextInt();
             i = i+1;

          if (E == I1) {
          A = A+1; B = B+0;
          if ( A > 1) { A = A-2; B = B-2;}
          }else if (E == I2) {
          A = A+1; B = B+1;
          if ( A > 1){ A = A-2;}
          else if (B > 1){ B = B-2;}
          }
        }
        System.out.println(A); System.out.println(B);
        teclado.close();
    }
}
    