
public class Matematica {
    int numeroA;
    int numeroB;
    public int soma() {
        int a = numeroA + numeroB;
        return a;
    }
    public int subtração(){
        int a = numeroA - numeroB;
        return a;
    }
    public int divisão(){
        int a = numeroA / numeroB;
        return a;
    }
    public int multiplicação(){
        int a = numeroA * numeroB;
        return a;
    }
    public static void main(String[] args) {
        Matematica conta1 = new Matematica();
        conta1.numeroA = 9;
        conta1.numeroB = 3;
        System.out.println(conta1.divisão());
        
    }
}
