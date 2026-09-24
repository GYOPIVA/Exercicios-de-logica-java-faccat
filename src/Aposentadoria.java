package Faccat;

import java.util.Scanner;

public class Aposentadoria {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua matricula: ex(1234)");
        String matricula = input.next();

        while (matricula.length() != 4) {
            System.out.println("Matrícula inválida! Digite exatamente 4 números:");
            matricula = input.next();
        }

        System.out.println("Digite o ano do seu nascimento:");
        double anoNascimento = input.nextDouble();
        while (anoNascimento > 2026 || anoNascimento < 0) {
            System.out.println("Digite uma data válida ");
            anoNascimento = input.nextDouble();
        }

        System.out.println("Digite o ano que ingressou na empresa:");
        double anoQueIngressou = input.nextDouble();
        while (anoQueIngressou > 2026 || anoQueIngressou < 0) {
            System.out.println("Digite uma data válida ");
            anoQueIngressou = input.nextDouble();
        }
        System.out.println("Ano de saída da empresa: ");
        double anoSaida = input.nextDouble();
        while (anoSaida > 2026 || anoSaida < 0) {
            System.out.println("Digite uma data válida ");
            anoSaida = input.nextDouble();
        }
        System.out.println("Digite a sua idade para verificar se pode aposentar");
        byte idade = input.nextByte();
        double tempoTrabalho = anoSaida - anoQueIngressou;

        if (idade > 64 || tempoTrabalho > 29){
            System.out.printf("Qualificado para a aposentadoria!\nIdade: %d\nTempo de serviço: %.0f anos", idade, tempoTrabalho);
        } else if ( idade > 59 && tempoTrabalho > 24) {
            System.out.printf("Qualificado para a aposentadoria!\nIdade: %d\nTempo de serviço: %.0f anos", idade, tempoTrabalho);
        }else {
            System.out.printf("Voce não pode aposentar!\nIdade: %d\nTempo de serviço: %.0f anos", idade, tempoTrabalho);
        }

    }
}
