package flamingo.java.aprendendo.basico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PrimeiroExercicio {

    public static void main(String[] args) {
        String nome = "Giovany Piveta";
        String endereco = "Av. Joãozinho Capenga";
        short numeroResidencia = 1552;
        int salario = 23000;

        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatoBrasileiro =
                DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("pt", "BR"));

        String dataFormatada = dataAtual.format(formatoBrasileiro);

        System.out.printf(
                "Eu %s, moro no endereço %s, número %d, confirmo o salário de R$ %d, na data de %s.%n",
                nome,
                endereco,
                numeroResidencia,
                salario,
                dataFormatada
        );
    }
}
