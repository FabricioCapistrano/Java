
import java.util.Scanner;


public class Tomadas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T_1 = in.nextInt();
        int T_2 = in.nextInt();
        int T_3 = in.nextInt();
        int T_4 = in.nextInt();
        
        System.out.println(T_1 + T_2 + T_3 + T_4 - 3);
        in.close();
    }
}
