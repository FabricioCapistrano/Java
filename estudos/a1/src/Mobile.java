
import java.util.Scanner;


public class Mobile {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            
            int A = teclado.nextInt();
            int B = teclado.nextInt();
            int C = teclado.nextInt();
            int D = teclado.nextInt();
            
            if(A == B+C+D){
                if(B+C == D){
                    if(B==C){
                        System.out.println("S");
                    }
                    else{
                        System.out.println("N");
                    }
                }
                else{
                    System.out.println("N");
                }
            }
            else{
                System.out.println("N");
            }  
            teclado.close();
        }
}