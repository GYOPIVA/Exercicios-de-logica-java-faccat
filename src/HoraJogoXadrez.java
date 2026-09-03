import java.util.Scanner;
import java.lang.String;

public class HoraJogoXadrez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte horaInicio, horaFim;

        System.out.println("Digite a hora de início do jogo:");
        horaInicio = input.nextByte();

        while (horaInicio < 0 || horaInicio > 23) {
            System.out.println("Digite uma hora válida entre 0 e 23:");
            horaInicio = input.nextByte();
        }

        System.out.println("Digite a hora que o jogo terminou:");
        horaFim = input.nextByte();

        while (horaFim < 0 || horaFim > 23) {
            System.out.println("Digite uma hora válida entre 0 e 23:");
            horaFim = input.nextByte();
        }

        if (horaFim <= horaInicio) {
            horaFim += 24;
        }


        int tempoDeJogo = horaFim - horaInicio;
        String total = (tempoDeJogo > 24) ? "A partida excedeu o tempo limite!" : "A partida teve a duração de %d horas";
        System.out.printf(total, tempoDeJogo);
    }
}
