import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);

        System.out.println("Programa Divisão");
        System.out.println("Digite um numero");
        int primeiroNumero = entradaDeDados.nextInt();
        System.out.println("Digite outro numero");
        int segundoNumero = entradaDeDados.nextInt();
        float divisao = primeiroNumero / segundoNumero;

        System.out.printf("O resultado da divisão é " + divisao);
    }
}
