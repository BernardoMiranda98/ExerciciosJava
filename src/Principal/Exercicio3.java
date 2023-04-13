package Principal;

import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) {

        String nome;
        int dia, mês;
        double valor;

        nome = JOptionPane.showInputDialog("Insira o nome");
        dia = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia de vencimento:"));
        mês = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês de vencimento:"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor fatura:"));

        JOptionPane.showMessageDialog(null, "Olá!" + nome + "." + "\nA sua fatura com vencimento em " + dia
                + " de " + mês + " no valor de R$ " + valor + " está fechada.");
    }
}
