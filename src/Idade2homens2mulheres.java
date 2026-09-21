package Faccat;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Idade2homens2mulheres {

   public static void main(String[] args) {

       byte[] idadesHomem = new byte[2];
       byte[] idadesMulheres = new byte[2];

       for (byte i = 0; i < idadesHomem.length; i++) {
           idadesHomem[i] = Byte.parseByte(
                   JOptionPane.showInputDialog("Digite a idade do " + (i + 1) + "° Homem:")
           );
       }

       for (byte i = 0; i < idadesMulheres.length; i++) {
           idadesMulheres[i] = Byte.parseByte(
                   JOptionPane.showInputDialog("Digite a idade da " + (i + 1) + "° Mulher:")
           );
       }
       Arrays.sort(idadesHomem);
       Arrays.sort(idadesMulheres);

       int calculoSoma = idadesHomem[1] + idadesMulheres[0];
       int calculoProduto = idadesHomem[0] * idadesMulheres[1];

       JOptionPane.showMessageDialog(null,"Soma: " + calculoSoma +
               "\nProduto: " + calculoProduto);
    }
}
