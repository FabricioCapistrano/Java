
import java.util.Arrays;
import java.util.Scanner;


public class idade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[3];
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }
        Arrays.sort(A);
        System.out.println(A[1]);
        in.close();
    }
}
