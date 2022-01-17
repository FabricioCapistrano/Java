import java.util.Scanner;

public class tabuleiro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int n;
        int tabuleiro[][];

        n=in.nextInt();                      
        tabuleiro= new int[n][n];
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                tabuleiro[i][j]=in.nextInt();
        
        for (int i=1; i<n; i++)              
            for (int j=1; j<n; j++)
                if (tabuleiro[i-1][j-1]+tabuleiro[i-1][j]+tabuleiro[i][j-1]>=2) 
                    tabuleiro[i][j]=0;             
                else
                    tabuleiro[i][j]=1;             

        System.out.println(tabuleiro[n-1][n-1]);   
        in.close();
    }
}
