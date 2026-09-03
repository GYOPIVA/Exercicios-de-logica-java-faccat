import java.util.Scanner;

public class Votar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double anoAtual, anoDigitado, idade;
        System.out.println("Digite o ano de atual: ");
        anoAtual = sc.nextDouble();
        System.out.println("Digite o ano de nascimento: ");
        anoDigitado = sc.nextDouble();
        idade = anoAtual - anoDigitado;
        System.out.println(idade >= 16 ? "Pode Votar" : "Não pode Votar!");

    }
}
