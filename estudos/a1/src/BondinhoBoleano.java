
import java.util.Scanner;


public class BondinhoBoleano {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int M = in.nextInt();
        boolean S = (A+M) <= 50;
        System.out.println(S);
        in.close();
    }
}
