import java.util.Scanner;

public class Saldo {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldoEmSuaConta = 0;
        System.out.println("--Programa Saldo--");
        System.out.println("Digite o Saldo em sua conta: ");

        while (!input.hasNextDouble()) {
            System.out.println("Valor inválido! Digite apenas números:");
            input.next();
        }

        saldoEmSuaConta = input.nextDouble();
        System.out.println("Digite o Débito em sua conta: ");

        while (!input.hasNextDouble()) {
            System.out.println("Valor inválido! Digite apenas números:");
            input.next();
        }
        double debitoConta = input.nextDouble();
        System.out.println("Digite o Crédito em sua conta: ");

        while (!input.hasNextDouble()) {
            System.out.println("Valor inválido! Digite apenas números:");
            input.next();
        }
        double creditoConta = input.nextDouble();
        double saldoTotal = saldoEmSuaConta - debitoConta + creditoConta;
        System.out.printf("Saldo atual: R$%.2f\n", saldoTotal);
        if (saldoTotal >= 0) {
            System.out.println("Saldo Positivo");
        }else {
            System.out.println("Saldo Negativo");
        }

    }
}
