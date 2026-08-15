import java.util.Scanner;

public class Antecessor {

    public static void main(String[] args) {
        System.out.println("Programa antecessor");
        System.out.println("Digite um numero");
        Scanner entradaDeDados = new Scanner(System.in);

        int numeroDigitado = entradaDeDados.nextInt();
        int antecessor = numeroDigitado - 1;
        System.out.println("o numero antecessor do " + numeroDigitado + " é " + antecessor);
    }
}
