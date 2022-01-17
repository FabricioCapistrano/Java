
import java.util.Scanner;


public class Bondinho {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Alunos = teclado.nextInt();
        int Monitores = teclado.nextInt();
        boolean quantidade = 50 >= Alunos+Monitores ;
        if (quantidade == true)
        {
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }
        teclado.close();
    }
}
