import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Programa Retangulo");
        System.out.println("Digite a Base do Retangulo");
        float base = entradaDados.nextFloat();
        System.out.println("Digite a Area do Retangulo");
        float altura = entradaDados.nextFloat();
        float area = base * altura;
        System.out.println("A area do retangulo é: " + area + "cm²");
    }
}
