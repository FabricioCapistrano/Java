
import java.util.Scanner;


public class TodosOsDivisores {    
     public static void main(String args[]) {
 
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = X;
        int Z = 1;
         for (int i = 1; i < X+1; i++) {
             Y = X;
             if (Y%Z == 0) {
                 System.out.println(i);
             }
             Z++;
         }
         in.close();
     }
}