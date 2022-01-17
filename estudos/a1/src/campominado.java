import java.util.Scanner;

public class campominado {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int tabuleiro[] = new int[n];
         
        int resposta[] = new int[n];
        

        for (int i = 0; i < tabuleiro.length; i++) {
            tabuleiro[i] = in.nextInt();
        }
        resposta[0] = tabuleiro[0] + tabuleiro[1];
        resposta[tabuleiro.length-1] = tabuleiro[n-1] + tabuleiro[n-2];
        
        for (int i = 1; i < tabuleiro.length-1; i++) {
            resposta[i] = tabuleiro[i-1] + tabuleiro[i] + tabuleiro[i+1];
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.println(resposta[i]);
        }
        in.close();
    }
}
