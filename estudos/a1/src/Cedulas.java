
import java.util.Scanner;


public class Cedulas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtd = teclado.nextInt();
        
        System.out.println(qtd/100 + " nota(s) de R$100,00");
        qtd = qtd % 100;
        System.out.println(qtd/50 +" nota(s)de R$50,00");
        qtd = qtd % 50;
        System.out.println(qtd/20 +" nota(s)  R$20,00");
        qtd = qtd % 20;
        System.out.println(qtd/10 +" notas de R$10,00");
        qtd = qtd % 10;
        System.out.println(qtd/5 +" notas de R$5,00");
        qtd = qtd % 5;
        System.out.println(qtd/2 +" notas de R$2,00");
        qtd = qtd % 2;
        System.out.println(qtd/1 +" notas de R$1,00");
        
        teclado.close();
    }
}
