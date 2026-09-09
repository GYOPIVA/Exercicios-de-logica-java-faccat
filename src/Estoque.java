import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {

        /*Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
compra'. */
        Scanner input = new Scanner(System.in);
        System.out.println("--Programa Calculo Estoque--");
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = input.nextLine();
        System.out.printf("Quantidade atual em estoque do produto '%s': ",nomeProduto);
        short quantidadeEstoque = input.nextShort();
        System.out.printf("Digite a quantidade máxima do produto '%s': ",nomeProduto);
        short quantidadeMax = input.nextShort();
        System.out.printf("Digite a quantidade mínima do produto '%s': ",nomeProduto);
        short quantidadeMin = input.nextShort();
        int mediaProdutos = (quantidadeMax + quantidadeMin) /2;
        if (quantidadeEstoque >= mediaProdutos){
            System.out.println("Não efetuar compra!");
        }else {
            System.out.println("Efetuar compra!");
        }

    }
}
