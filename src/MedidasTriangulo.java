package faccat;

import java.util.Scanner;

public class MedidasTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa Calculo Triangulo");
        System.out.println("Digite a medida do lado A:");
        double ladoA = sc.nextDouble();

        System.out.println("Digite a medida do lado B:");
        double ladoB = sc.nextDouble();

        System.out.println("Digite a medida do lado C:");
        double ladoC = sc.nextDouble();

        if (ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB)){
            System.out.println("Os valores formam um triangulo");
        }else{
            System.out.println("Não formam um triangulo");
        }
    }
}
