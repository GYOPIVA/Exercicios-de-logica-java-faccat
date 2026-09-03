import java.util.Scanner;

public class VendaMaca {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Programa Calculo--");
        System.out.println("Digite a quantidade de maças para compra: ");
        int quantidadeMaca = sc.nextInt();
        float total;
        if (quantidadeMaca <= 11){
            total = quantidadeMaca * 1.3f;
            System.out.printf("O total de %d maças foi de: R$%.2f", quantidadeMaca,total);
        }else {
            total = quantidadeMaca * 1f;
            System.out.printf("O total de %d maças foi de: R$%.2f", quantidadeMaca,total);
        }
        sc.close();
    }
}
