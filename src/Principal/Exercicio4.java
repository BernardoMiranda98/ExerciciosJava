package Principal;

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) {
        int valor;
        int dezena;
        int divisão;
        valor = Integer.parseInt(JOptionPane.showInputDialog("insira um valor em milhar"));
        divisão = valor /10;
        dezena = divisão % 10;

        JOptionPane.showMessageDialog(null, "o numero da dezena é " + dezena);

    }
}
