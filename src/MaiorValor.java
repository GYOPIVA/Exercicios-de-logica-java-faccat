import java.util.Scanner;

public class MaiorValor {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[3];
        int maior = 0;
        for (byte i = 0; i < numeros.length ; i++) {
            System.out.printf("Digite o %d numero:\n",i + 1);
            numeros[i] = input.nextInt();

            if (numeros[i] > maior) {
                maior = numeros[i];
        }
    }
        System.out.println("O maior valor é " + maior);
}
}
