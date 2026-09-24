package Faccat;

import java.util.Scanner;

public class MediaAproveitamento {
    static void main() {
       Scanner input = new Scanner(System.in);
       double[] notas = new double[3];

        System.out.println("Digite a primeira nota :");
        notas[0] = input.nextDouble();
        System.out.println("Digite a segunda nota :");
        notas[1] = input.nextDouble();
        System.out.println("Digite a terceira nota :");
        notas[2] = input.nextDouble();

            System.out.println("Digie a média dos exercicios: ");
            double mediaExercicios = input.nextDouble();

            double mediaAproveitamento = (notas[0] + (notas[1] * 2) + (notas[2] * 3) + mediaExercicios) / 7;

            if (mediaAproveitamento >= 9){
                System.out.println("Nota A");
            } else if (mediaAproveitamento >= 7 && mediaAproveitamento < 9){
                System.out.println("Nota B");
            } else if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
                System.out.println("Nota C");
            }else {
                System.out.println("Nota D");
            }
        }
    }





