
import java.util.Scanner;


public class PremioDoMilhao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int i = 0;
        int E = 0;
        while(i < N){
            
             
             if(E <= 1000000){
               E = E + teclado.nextInt();
             i = i+1;
               
             }
             E = teclado.nextInt();
        }
        

        System.out.println(i);
        teclado.close();
    }
}
