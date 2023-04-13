package Principal;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio9 {

    public static void main(String[] args) {

        double IPI = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem do IPI? "));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto 1? "));
        int qnt = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade do produto 1? "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto 2? "));
        int qnt2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a pquantidade do produto 2? "));

        double prod1 = valor * qnt;
        double prod2 = valor2 * qnt2;
        double total = prod1 + prod2;
        double ipi = total * (IPI / 100 + 1);

        JOptionPane.showMessageDialog(null, "Valor total: " + total);
        JOptionPane.showMessageDialog(null, "Valor com IPI: " + new DecimalFormat(".##").format(ipi));

    }

}
