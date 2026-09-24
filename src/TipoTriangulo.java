package Faccat;

import java.util.Scanner;

public class TipoTriangulo {

    static void main(String[] args) {
        double medidaA, medidaB, medidaC;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira medida do triangulo:");
        medidaA = entrada.nextDouble();
        System.out.println("Digite a segunda medida do triangulo:");
        medidaB = entrada.nextDouble();
        System.out.println("Digite a terceira medida do triangulo:");
        medidaC = entrada.nextDouble();
        String verificar = "";

        if (medidaA == medidaB && medidaB == medidaC && medidaC < (medidaA + medidaB)){
            verificar = "Triangulo Equilátero";
        }else if(medidaA == medidaB || medidaB == medidaC || medidaA == medidaC){
            verificar = "Triangulo Isósceles";
        }else {
            verificar = "Triangulo Escaleno";
        }

        System.out.println(verificar);
    }


}
