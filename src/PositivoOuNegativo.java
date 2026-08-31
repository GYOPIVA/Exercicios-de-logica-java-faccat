import java.util.Scanner;

public class PositivoOuNegativo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDigitado;
        System.out.println("Digite um numero: ");
        numeroDigitado = sc.nextInt();
        if (numeroDigitado < 0){
            System.out.println("O numero digitado é negativo");
        }else {
            System.out.println("O numero digitado é positivo");
        }
    }
}
