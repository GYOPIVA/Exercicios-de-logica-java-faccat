package faccat;

import java.util.Scanner;

public class PostoDeGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite [A] para abastecer Álcool e [G] para abastecer Gasolina");
        char categoriaDigitada = sc.next().toUpperCase().charAt(0);
        while (categoriaDigitada != 'A' && categoriaDigitada != 'G') {
            System.out.println("Opção inválida! Digite novamente ([A]lcool ou [G]asolina):");
            categoriaDigitada = sc.next().toUpperCase().charAt(0);
        }
        String categoria = (categoriaDigitada == 'A') ? "Àlcool":"Gasolina";

        System.out.printf("Digite a quantidade em litros de %s: ",categoria);
        double litros = sc.nextDouble();
        double valorTotal;
        if(categoria.equalsIgnoreCase("Àlcool")){
            if (litros < 21){
                litros = (litros * 2.90d);
                valorTotal = litros - (litros * 0.03);
                System.out.printf("Total de %s R$%.2f", categoria,valorTotal);
            }else{
                litros = (litros * 2.90d);
                valorTotal = litros - litros * 0.05;
                System.out.printf("Total de %s R$%.2f", categoria,valorTotal);
            }

        }else if(categoria.equalsIgnoreCase("Gasolina")){
            if(litros < 21){
                litros = (litros * 3.30d);
                valorTotal = litros - (litros * 0.04);
                System.out.printf("Total de %s R$%.2f", categoria,valorTotal);
            }else{
                litros = (litros * 3.30d);
                valorTotal = litros - litros * 0.06;
                System.out.printf("Total de %s R$%.2f", categoria,valorTotal);
            }
        }
    }

}

