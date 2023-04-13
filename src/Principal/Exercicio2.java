
package Principal;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main (String[] args){
        
        int nota1, nota2, nota3, nota4;
        double média;
        
        
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da nota:"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da nota:"));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da nota:"));
        nota4 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da nota:"));
        
        média = (nota1 + nota2 + nota3 + nota4) / 4;
        
        JOptionPane.showMessageDialog(null, "O valor da média é:" + média);
    }
    
    
}
