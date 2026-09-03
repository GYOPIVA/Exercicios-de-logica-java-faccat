import java.util.Scanner;

public class VendasEmpresa {
    static void main(String[] args) {
        /* Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
ultrapassar este valor, calcular e escrever o seu salário total.*/
        Scanner sc = new Scanner(System.in);

        double salarioFixo, valorEmVendas, saldoTotal;

        System.out.println("----Programa Vendas Empresa----");
        System.out.println("Digite o salário fixo do funcionário");
        salarioFixo = sc.nextDouble();
        System.out.println("Digite o valor em vendas efetuadas");
        valorEmVendas = sc.nextDouble();

        if (valorEmVendas <= 1500){
            valorEmVendas = valorEmVendas * 0.03;
        } else if (valorEmVendas > 1500) {
            valorEmVendas = (1500 * 0.03) + ((valorEmVendas - 1500) * 0.05);
        }
        saldoTotal = salarioFixo + valorEmVendas;

        System.out.printf("---Resumo do funcionário---\n" +
                "Salário fixo: R$%.2f\n" +
                "Comissão: R$%.2f \n" +
                "Salário total: R$%.2f", salarioFixo, valorEmVendas, saldoTotal);
    }
}
