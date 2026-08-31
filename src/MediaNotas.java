import java.util.Scanner;

public class MediaNotas {
    /* Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
final é:*/


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            byte[] notas = new byte[3];

            System.out.println("___Programa de média notas___");
            System.out.println("Digite a primeira nota: ");
            notas[0] = sc.nextByte();
            System.out.println("Digite a segunda nota: ");
            notas[1] = sc.nextByte();
            System.out.println("Digite a terceira nota: ");
            notas[2] = sc.nextByte();
            float media = ((notas[0]*2f) + (notas[1]*3f) + (notas[2]*5f))/10f;
            System.out.println("A média ponderada das notas informadas é: " + media);
        }
}