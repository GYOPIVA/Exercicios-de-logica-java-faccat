import java.util.Scanner;

/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor.*/

public class Revendedora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double porcentagemVendas,salarioFixo = 2300 ,comissaoFixa = 200,salarioTotal, valorVenda, comissaoTotal;
        byte carrosVendidos ;
        System.out.println("---Programa Revendedora ---");
        System.out.println("Digite o numero de carros vendidos: ");
        carrosVendidos = sc.nextByte();

        System.out.println("Digite o valor total de carros vendidos R$: ");
        valorVenda = sc.nextDouble();
        porcentagemVendas = valorVenda*0.05;
        comissaoTotal = carrosVendidos * comissaoFixa;
        salarioTotal = porcentagemVendas + salarioFixo + (comissaoFixa * carrosVendidos);

        System.out.printf("Seu funcionário tem a remuneração de R$%.2f\n" +
                "--Dados de venda--\n" +
                "Salário Fixo: R$%.2f\n" +
                "Porcentagem Vendas: R$%.2f\n" +
                "Carros Vendidos: %d\n" +
                "Comissão Total: R$%.2f", salarioTotal,salarioFixo,porcentagemVendas,carrosVendidos,comissaoTotal);
        sc.close();

    }
}
