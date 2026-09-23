package faccat;

import java.util.Scanner;

public class ComparacaoDoisNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numerosDigitados = new double[2];
        System.out.println("Digite um numero");
        numerosDigitados[0] = sc.nextDouble();
        System.out.println("Digite outro numero");
        numerosDigitados[1] = sc.nextDouble();

        String resultado;

        if(numerosDigitados[0] > numerosDigitados[1]){
            resultado = "O primeiro numero é maior";
        } else if (numerosDigitados[0]<numerosDigitados[1] ) {
            resultado = "O segundo numero é maior";
        }else {
            resultado = "Numeros iguais";
        }

        System.out.println(resultado);


    }
}
