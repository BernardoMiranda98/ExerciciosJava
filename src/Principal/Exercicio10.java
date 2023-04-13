package Principal;

import javax.swing.JOptionPane;

public class Exercicio10 {

    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor para x? "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor para y? "));
        double divisão = x/y;

        JOptionPane.showMessageDialog(null, x * y);
        JOptionPane.showMessageDialog(null, x + y);
        JOptionPane.showMessageDialog(null, x / y);
        JOptionPane.showMessageDialog(null, x % y);
        JOptionPane.showMessageDialog(null, divisão);

    }
}
