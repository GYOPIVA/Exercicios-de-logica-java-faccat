import java.util.Arrays;
import java.util.Scanner;

public class ValorMaior {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeroDigitado = new double[2];
        System.out.println("Digite um numero: ");
        numeroDigitado[0] = sc.nextDouble();
        System.out.println("Digite outro numero: ");
        numeroDigitado[1] = sc.nextDouble();
        if (numeroDigitado[0] == numeroDigitado[1]){
            System.out.println("Os numeros são iguais");
            return;
        }else {
            Arrays.sort(numeroDigitado);
            System.out.printf("O maior numero digitado é: %.0f", numeroDigitado[1]);
        }

    }
}
