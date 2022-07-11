import javax.swing.JOptionPane;
import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer idade;
        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();
        if (idade <= 3) {
            JOptionPane.showMessageDialog(null, " bebe");
        }
        if ((idade >= 4) && (idade <= 9)) {
            JOptionPane.showMessageDialog(null, " criançinha");
        }
        if ((idade >= 10) && (idade <= 13)) {
            JOptionPane.showMessageDialog(null, "pré-adolescente");
        }
        if ((idade >= 14) && (idade <= 17)) {
            JOptionPane.showMessageDialog(null, "adolescente");
        }
        if ((idade >= 18) && (idade <= 25)) {
            JOptionPane.showMessageDialog(null, "jovem adulto");
        }
        if ((idade >= 26) && (idade <= 50)) {
            JOptionPane.showMessageDialog(null, " adulto");
        }
        if ((idade >= 51) && (idade <= 65)) {
            JOptionPane.showMessageDialog(null, "ja pode chamar de senhor ");
        }
        if (idade >= 66) {
            JOptionPane.showMessageDialog(null, "Veio pra caramba");
        }

    }
}
