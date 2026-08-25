import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte idadeEmAnos, meses;

        System.out.println("### Idade expressa em anos ###");
        System.out.println("Qual a sua idade?");
        idadeEmAnos = sc.nextByte();

        System.out.println("Quantos meses além dos anos você tem?");
        meses = sc.nextByte();

        // 1. Calcula o total de meses da sua vida inteira
        int idadeEmMesesTotal = (idadeEmAnos * 12) + meses;

        // 2. CORREÇÃO: Calcula os dias usando apenas a variável 'meses' que o usuário digitou
        int idadeEmDias = (idadeEmAnos * 365) + (meses * 30);

        System.out.println("Calculando...");
        // Ajustado para mostrar os meses digitados e o total correto de dias
        System.out.println("Você tem " + idadeEmAnos + " anos, " + meses + " meses (Total de " + idadeEmMesesTotal + " meses de vida) e " + idadeEmDias + " dias de vida.");

        sc.close();
    }
}
