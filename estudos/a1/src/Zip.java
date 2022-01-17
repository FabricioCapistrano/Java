
import java.util.Scanner;


public class Zip {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Entrada
        int L1 = teclado.nextInt();
        int L2 = teclado.nextInt();
        int C1 = teclado.nextInt();
        int C2 = teclado.nextInt();
        int L3;
        int C3;
        
        //Lia
        if(L1==L2){L3 = (L1 + L2)*2;}
        
        else if(L2 == L1 - 1){L3 = (L1+L2)*3;}
        
        else if(L1 == L2 - 1){ L3 = (L1+L2)*3;}
        
        else{L3 = L1+L2;}

        //Carolina
        if(C1==C2){C3 = (C1 + C2)*2;}
        
        else if(C2 == C1 - 1){C3 = (C1 + C2)*3;}
        
        else if(C1 == C2 - 1){C3 = (C1 + C2)*3;}
        
        else{C3 = C1 + C2;}
        
        //Saída
        if(L3 == C3){System.out.println("empate");}
        
        else if(L3 >= C3){System.out.println("Lia");}
        
        else{System.out.println("Carolina");}
        teclado.close();
    }
}
