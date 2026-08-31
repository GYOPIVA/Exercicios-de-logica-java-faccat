import java.util.Scanner;

public class MaiorMenor10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short numeroDigitado;
        System.out.println("Digite um numero: ");
        numeroDigitado = sc.nextShort();
        if (numeroDigitado < 10){
            System.out.println("O numero digitado é menor que 10");
        }else if(numeroDigitado == 10){
            System.out.println("O numero digitado é igual a 10");
        }else{
            System.out.println("O numero digitado é maior que 10");
        }
        sc.close();
    }
}
