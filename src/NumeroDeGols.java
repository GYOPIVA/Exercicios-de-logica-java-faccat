package faccat;

import java.sql.Time;
import java.util.Scanner;

public class NumeroDeGols {

    public static void main(String[] args) {
        String[] times = new String[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do primeiro time:");
        times[0] = sc.nextLine();
        System.out.println("Digite o nome do segundo time time:");
        times[1] = sc.nextLine();

        byte[] gols = new byte[2];
        System.out.printf("Digite o numero de gols do time %s: ", times[0]);
        gols[0] = sc.nextByte();

        while (gols [0] < 0){
            System.out.println("Numero de gols inválido\nDigite novamente:");
            gols[0] = sc.nextByte();
        }
        System.out.printf("Digite o numero de gols do time %s: ", times[1]);
        gols[1] = sc.nextByte();
        while (gols [1] < 0){
            System.out.println("Numero de gols inválido\nDigite novamente:");
            gols[1] = sc.nextByte();
        }
        sc.close();
        if (gols [0] > gols[1]){
            System.out.printf("O time %s venceu de %d a %d", times[0], gols[0],gols[1]);
        } else if (gols[0] < gols[1]) {
            System.out.printf("O time %s venceu de %d a %d", times[1], gols[1],gols[0]);
        }else {
            System.out.println("Empate");
        }

    }
}
