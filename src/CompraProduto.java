package Faccat;

import java.util.Scanner;

public class CompraProduto {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nomeProduto;
        double quantidadeAdquirida, preco, desconto, total;

        System.out.println("Digite o nome do produto: ");
        nomeProduto = input.nextLine();
        System.out.println("Digite o quantidade a ser comprada do produto: ");
        quantidadeAdquirida = input.nextDouble();
        System.out.println("Digite o preço unitario");
        preco = input.nextDouble();

        if(quantidadeAdquirida <= 5){
            desconto = (quantidadeAdquirida * preco) * 0.02;
        }else if(quantidadeAdquirida > 5 && quantidadeAdquirida <= 10){
            desconto = (quantidadeAdquirida * preco) * 0.03;
        }else {
            desconto = (quantidadeAdquirida * preco) * 0.05;
        }
        total = quantidadeAdquirida * preco - desconto;

        System.out.printf("Produto: %s\nQuantidade: %.0f\nPreço Unitário: R$%.2f\nTotal: R$%.2f", nomeProduto, quantidadeAdquirida, preco, total);

    }
}
