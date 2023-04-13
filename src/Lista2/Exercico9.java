
package Lista2;

import javax.swing.JOptionPane;

public class Exercico9 {
    public static void main (String[] args){
         
        String nome = JOptionPane.showInputDialog("Insira o nome do produto");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto"));
        int nacionalidade = Integer.parseInt(JOptionPane.showInputDialog("1- Nacional \n2 -Importado "));
        double importado = (valor*5.17) + (valor*5.17*0.35);
        if (nacionalidade == 1){
            JOptionPane.showMessageDialog(null,"Nome do produto: " + nome + "\nPreço do produto: " + valor
            + "Nacionalidade: Nacional");
        }else{
            JOptionPane.showMessageDialog(null,"Nome do produto: " + nome + "\nPreço do produto: " + importado 
            + "\nNacionalidade: Importado");
        }
    }
}
