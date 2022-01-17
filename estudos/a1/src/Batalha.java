
import java.util.Scanner;


public class Batalha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int A1 = teclado.nextInt();
        int D1 = teclado.nextInt();
        int A2 = teclado.nextInt();
        int D2 = teclado.nextInt();
        
        if(A1==D2 && A2==D1){
            System.out.println("-1");
        }
        else if(A1>D2 && A2==D1){
            System.out.println("1");
        }
        else if(A1<D2 && A2==D1){
            System.out.println("2");
        }
        else if(A1==D2 && A2>D1){
            System.out.println("2");
        }
        else if(A1==D2 && A2<D1){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
        teclado.close();
    }
}
