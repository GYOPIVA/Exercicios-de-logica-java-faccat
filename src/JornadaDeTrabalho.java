import java.util.Scanner;

public class JornadaDeTrabalho {
    static void main(String[] args) {
        /* A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
(considere que o mês possua 4 semanas exatas). */

        Scanner input = new Scanner(System.in);
        System.out.println("---Programa Calculo Horas Extras---");
        System.out.println("Informe o seu salário base: ");

        double baseSalario = input.nextDouble();
        while (baseSalario <= 0) {
            System.out.println("Digite um salário válido:");
            baseSalario = input.nextDouble();
        }

        System.out.println("Infome o número de horas trabalhadas em um mês:");
        short horasTrabalhadas = input.nextShort();
        while (horasTrabalhadas < 0) {
            System.out.println("Digite uma quantidade de horas válida:");
            horasTrabalhadas = input.nextShort();
        }

        final byte DIAS_MES = 20;
        final byte HORAS_DIA = 8;
        double salarioEmHoras = baseSalario / DIAS_MES / HORAS_DIA;

        double salarioTotal = baseSalario, horasExtra = 0, salarioExtra = 0;

        if (horasTrabalhadas > 160) {
            horasExtra = horasTrabalhadas - 160;
            salarioExtra = horasExtra * salarioEmHoras * 1.5;
            salarioTotal += salarioExtra;
        }

        System.out.printf("Salário base: R$ %.2f \nHoras Trabalhadas: %d \nHoras Extras: %.0f \nSaldo em Horas Extra: R$%.2f \nSalário Total: R$%.2f",
                baseSalario, horasTrabalhadas, horasExtra, salarioExtra, salarioTotal);
    }
}
