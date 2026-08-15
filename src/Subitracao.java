import java.util.Scanner;

public class Subitracao {

    public static void main(String[] args){

        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Programa de subtração");
        System.out.println("Digite um valor");


        int primeiroValor = entradaDados.nextInt();
        System.out.println("Digite outro valor");
        int segundoValor = entradaDados.nextInt();
        int subtracao = primeiroValor - segundoValor;

        System.out.println("O resultado da subtração do numero " + primeiroValor + " - " + segundoValor + " = " + subtracao);

    }
}
