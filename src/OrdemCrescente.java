import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a ser digitado: ");
        int numeros =  input.nextInt();
        double[] numerosDigitados = new double[numeros];

        for (byte i = 0; i < numerosDigitados.length; i++) {
            System.out.printf("Digite o %.0f° numero: \n", i + 1f);
            numerosDigitados[i] = input.nextDouble();
        }
        Arrays.sort(numerosDigitados);
        System.out.println("Ordem crescente dos números:");
        for ( double i : numerosDigitados){
            System.out.printf("%.0f\n",i);
        }
    }
}
