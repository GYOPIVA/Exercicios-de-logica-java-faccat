import java.util.Scanner;

public class Carrinho {
    public static void main(String[] args) {

        double custoFabrica, impostoDistribuidora, imposto, valorNovo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do Veiculo");
        custoFabrica = sc.nextDouble();
        impostoDistribuidora = custoFabrica * 0.28;
        imposto = custoFabrica * 0.45;
        valorNovo = custoFabrica + impostoDistribuidora + imposto;
        System.out.printf("O valor na fabrica é %.2f\n" +
                "O imposto da Distribuidora é %.0f\n" +
                "O imposto do governo é %.0f\n" +
                "Totalizando %.2f", custoFabrica, impostoDistribuidora, imposto,valorNovo);
    }
}
