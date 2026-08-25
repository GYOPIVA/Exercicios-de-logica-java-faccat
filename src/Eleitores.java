import java.util.Scanner;

public class Eleitores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte totalEleitores;
        short votosEmBranco, votosEmNulo, votosValidos;
        float porcentagemVotosBranco, porcentagemVotosNulo, porcentagemVotosValidos;

        System.out.println("##Programa Eleitores###");

        System.out.println("Digite o numero de Eleitores");
        totalEleitores = sc.nextByte();

        System.out.println("Digite a quantidade de votos em branco");
        votosEmBranco = sc.nextShort();

        System.out.println("Digite a quantidade de votos em nulo");
        votosEmNulo = sc.nextShort();

        System.out.println("Digite a quantidade de votos validos");
        votosValidos = sc.nextShort();

        porcentagemVotosBranco = (votosEmBranco * totalEleitores) /100.0f;
        porcentagemVotosNulo = (votosEmNulo * totalEleitores) /100f;
        porcentagemVotosValidos = (votosValidos * totalEleitores) /100f;

        System.out.printf("Votos em Branco %f %% \n" +
                "Votos em Nulo %f %% \n" +
                "Votos Validos %f %%", porcentagemVotosBranco, porcentagemVotosNulo, porcentagemVotosValidos);

    }
}
