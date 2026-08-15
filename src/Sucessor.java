import java.util.Scanner;

public class Sucessor {
    public static void main(String[] args) {
        System.out.println("Programa Sucessor");
        System.out.println("Digite um numero");
        Scanner entradaDados = new Scanner(System.in);
        int primeiroNumero = entradaDados.nextInt();
        int sucessor = primeiroNumero + 1 ;
        System.out.printf("O numero sucessor de " + primeiroNumero + " é " + sucessor);
    }
}
