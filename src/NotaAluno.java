import java.util.Scanner;

public class NotaAluno {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte primeiraNota,segundaNota;
        System.out.println("--Programa média--");
        System.out.println("Digite o primeira nota: ");
        primeiraNota = sc.nextByte();
        System.out.println("Digite o segunda nota: ");
        segundaNota = sc.nextByte();
        float media = (primeiraNota+segundaNota)/2f;
        if (media>=6){
            System.out.printf("Nota: %.1f aluno foi aprovado",media);
        }else {
            System.out.printf("Nota: %.1f aluno foi reprovado",media);
        }
        sc.close();
    }
}
