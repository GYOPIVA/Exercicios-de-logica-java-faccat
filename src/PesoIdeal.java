import java.util.Scanner;

public class PesoIdeal {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, pesoIdeal = 0;
        System.out.println("Digite a sua altura: ");
        altura = input.nextDouble();
        System.out.println("Digite a seu sexo: 'M' ou 'F' ");
        String sexo = input.next().toUpperCase();

        while (!sexo.equals("M") && !sexo.equals("F")){
            System.out.println("Digite apenas 'M' ou 'F'");
            sexo = input.next();
        }
        if (sexo.equals("F")){
            pesoIdeal = (altura - 100) - ((altura - 150) / 4);
            sexo = "Mulher";
        }else if (sexo.equals("M")){
            pesoIdeal = (altura - 100) - ((altura - 150) / 2.5);
            sexo = "Homem";
        }

        System.out.printf("O peso ideal para %s é %.1f kg", sexo, pesoIdeal);
    }
}