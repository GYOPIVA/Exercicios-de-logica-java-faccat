import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("--Programa numero negativo positivo ou zero--\n");
        System.out.println("Digite um numero:");
        int numero = input.nextInt();
        if (numero > 0) {
            System.out.println("Número Positivo");
        } else if (numero < 0) {
            System.out.println("Número Negativo");
        } else {
            System.out.println("Número Zero");
        }
        input.close();
    }
}
