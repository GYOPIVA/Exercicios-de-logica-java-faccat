import java.util.Scanner;

public class Temperatura {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("_____Programa temperatura_____");
        System.out.println("Digite a temperatura em Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("___Conversão___\n" +
                "Fahrenheit: %.0fF\n" +
                "Celsius: %.0f°", fahrenheit,celsius);

    }
}
