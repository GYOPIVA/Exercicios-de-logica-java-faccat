package Faccat;
import javax.swing.JOptionPane;

public class Fruteira {
    static void main(String[] args) {

        double kgMorango, kgMaca,totalMorango, totalMaca, kgTotal, totalCompra = 0;

        kgMorango = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Digite em kilos a quantidade de Morangos"));

        while (kgMorango < 0){
            kgMorango = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Digite um valor válido!"));
        }

        kgMaca = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Digite em kilos a quantidade de Morangos"));

        while (kgMaca < 0){
            kgMaca = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Digite um valor válido!"));
        }

        totalMorango = kgMorango > 5 ? kgMorango * 2.20d : kgMorango * 2.50d;
        totalMaca = kgMaca > 5 ? kgMaca * 1.50d : kgMaca * 1.80d;
        kgTotal = kgMorango + kgMaca;
        totalCompra = totalMorango + totalMaca;

        if (kgTotal > 8 || totalCompra > 25 ) {
            totalCompra = totalCompra - (totalCompra * 0.1);
        }


        JOptionPane.showMessageDialog(null,
                "O valor total de morangos R$ " + String.format("%.2f", totalMorango) +
                        "\nO valor total de maçãs R$ " + String.format("%.2f", totalMaca) +
                        "\nTotal compra R$ " + String.format("%.2f", totalCompra));

    }
}
