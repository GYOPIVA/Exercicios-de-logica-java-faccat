import java.util.Scanner;

public class Multiplicacao {

    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa de multiplicação");
        System.out.println("Digite um numero");
        int primeiroValor = entradaDados.nextInt();
        System.out.println("Digite um numero");
        int segundoValor = entradaDados.nextInt();
        int multiplicacao = primeiroValor * segundoValor;
        System.out.println("O valor multiplicado dos numeros digitados é " + multiplicacao);
    }
}
